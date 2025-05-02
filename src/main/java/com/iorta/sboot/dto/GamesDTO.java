package com.iorta.sboot.dto;

public class GamesDTO {

	private int id;
	private String name;
	private String genre;
	private int maxPlayers;
	
	public GamesDTO() {}

	public GamesDTO(int id, String name, String genre, int maxPlayers) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.maxPlayers = maxPlayers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getMaxPlayers() {
		return maxPlayers;
	}

	public void setMaxPlayers(int maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
	
}
