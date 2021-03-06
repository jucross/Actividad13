package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PokemonService;

@RestController
public class Pokemon {
	
	@Autowired
	PokemonService pokeserv;

	@RequestMapping()
	public String inicio() {
		return "Favor de Elegir un pokemon /Nombre Pokemon";
	}
	
	@RequestMapping("/abilities/{pokemon}")
	public String abilities (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIabilities(pokemon);
	}
	
	@RequestMapping("/base-experiences/{pokemon}")
	public String base_experience (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIbase_experiences(pokemon);
	}
	
	@RequestMapping("/held-items/{pokemon}")
	public String held_items (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIheld_item(pokemon);
	}
	
	@RequestMapping("/id/{pokemon}")
	public String id (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIid(pokemon);
	}
	
	@RequestMapping("/name/{pokemon}")
	public String name (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIname(pokemon);
	}
	
	@RequestMapping("/location-area-encounters/{pokemon}")
	public String location_area_encounter (@PathVariable("pokemon") String pokemon) {
		
		return pokeserv.APIlocation_area_encounters(pokemon);
	}
	
	
	
}
