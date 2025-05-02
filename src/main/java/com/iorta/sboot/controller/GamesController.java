package com.iorta.sboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iorta.sboot.dto.GamesDTO;


@RestController
@RequestMapping("/games") 
public class GamesController {
	
	private static final List<GamesDTO> gameList = Arrays.asList(
			new GamesDTO(1, "Chess", "Strategy", 2),
			new GamesDTO(2, "FIFA", "Sports", 2),
			new GamesDTO(3, "Valorant", "FPS", 5),
			new GamesDTO(4, "Dota 2", "MOBA", 5)
	);
			
	@GetMapping("/getGameById/{id}")
	public GamesDTO getGameById(@PathVariable int id) {
		return gameList.stream()
					.filter(game -> game.getId() == id)
					.findFirst()
					.orElse(null);
	}
	
}
