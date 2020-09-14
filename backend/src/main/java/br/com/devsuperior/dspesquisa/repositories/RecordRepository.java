package br.com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
