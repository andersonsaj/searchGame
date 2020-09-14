package br.com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
