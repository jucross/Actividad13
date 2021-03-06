package com.example.demo.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

	private String pokeapi = "https://pokeapi.co/api/v2/pokemon/";
	String abilities;
	String base_experiences;
	String held_item;
	String id;
	String name;
	String location_area_encounters;

	public String APIabilities (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		abilities =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(abilities);
		abilities = obtenerObj.optString("abilities");
			
		return abilities;
		}
	
	public String APIbase_experiences (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		base_experiences =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(base_experiences);
		base_experiences = obtenerObj.optString("base_experience");
			
		return base_experiences;
		}

	public String APIheld_item (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		held_item =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(held_item);
		held_item = obtenerObj.optString("held_items");
			
		return held_item;
		}

	public String APIid (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		id =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(id);
		id = obtenerObj.optString("id");
			
		return id;
		}

	public String APIname (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		name =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(name);
		name = obtenerObj.optString("name");
			
		return name;
		}

	public String APIlocation_area_encounters (String pokemon){
		
		RestTemplate restTemplate = new RestTemplate();
		location_area_encounters =restTemplate.getForObject(pokeapi+pokemon,String.class);
		JSONObject obtenerObj = new JSONObject(location_area_encounters);
		location_area_encounters = obtenerObj.optString("location_area_encounters");
			
		return location_area_encounters;
		}

}
