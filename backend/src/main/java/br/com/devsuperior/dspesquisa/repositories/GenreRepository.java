package br.com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devsuperior.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{
	
}
