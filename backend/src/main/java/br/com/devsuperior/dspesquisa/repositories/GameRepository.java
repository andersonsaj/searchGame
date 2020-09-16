package br.com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devsuperior.dspesquisa.entities.Game;

//@Component
@Repository
public interface GameRepository extends JpaRepository<Game, Long>{
	
}
