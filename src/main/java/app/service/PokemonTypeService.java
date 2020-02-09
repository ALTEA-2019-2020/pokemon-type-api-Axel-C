package app.service;

import app.bo.PokemonType;

import java.util.List;

public interface PokemonTypeService {
    PokemonType getPokemonType(int id);
    PokemonType getPokemonName(String name);
    List<PokemonType> getAllPokemonTypes();
}