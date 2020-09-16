package br.com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import br.com.devsuperior.dspesquisa.entities.Record;

public class RecordInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long gameId;
	private String name;
	private Integer age;

	
	public RecordInsertDTO() {}
	
	public RecordInsertDTO(Record entity) {
		gameId = entity.getId();
		name = entity.getName();
		age = entity.getAge();
	}

	public Long getGameId() {
		return gameId;
	}

	public void setGameId(Long id) {
		this.gameId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
