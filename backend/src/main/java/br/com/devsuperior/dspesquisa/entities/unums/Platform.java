package br.com.devsuperior.dspesquisa.entities.unums;


public enum Platform {
	
	PC(1), 
	PLAYSTATION(2),
	XBOX(3);
	
	
	private int code;
	
	private Platform(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static Platform valueOf(int code) {
		for(Platform value : Platform.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Platform code");
	}

}
