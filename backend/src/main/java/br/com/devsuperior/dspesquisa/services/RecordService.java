package br.com.devsuperior.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devsuperior.dspesquisa.dto.RecordDTO;
import br.com.devsuperior.dspesquisa.dto.RecordInsertDTO;
import br.com.devsuperior.dspesquisa.entities.Game;
import br.com.devsuperior.dspesquisa.entities.Record;
import br.com.devsuperior.dspesquisa.repositories.GameRepository;
import br.com.devsuperior.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	  
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional
	public RecordDTO insert(RecordInsertDTO dto){
		Record entity = new Record();
		entity.setAge(dto.getAge());
		entity.setName(dto.getName());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity);
	}
	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant min, Instant max, PageRequest pageRequest) {
		return repository.findByMoments(min, max, pageRequest).map(x -> new RecordDTO(x));
	}
}
