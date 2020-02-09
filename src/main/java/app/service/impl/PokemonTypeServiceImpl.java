package app.service.impl;

import app.bo.PokemonType;
import org.springframework.stereotype.Service;
import app.repository.PokemonTypeRepository;
import app.service.PokemonTypeService;

import java.util.List;

@Service
public class PokemonTypeServiceImpl implements PokemonTypeService {

    public PokemonTypeRepository pokemonTypeRepository;

    public PokemonTypeServiceImpl(PokemonTypeRepository pokemonTypeRepository){
        this.pokemonTypeRepository = pokemonTypeRepository;

    }

    @Override
    public PokemonType getPokemonType(int id) {
        return pokemonTypeRepository.findPokemonTypeById(id);
    }

    @Override
    public List<PokemonType> getAllPokemonTypes(){
        return pokemonTypeRepository.findAllPokemonType();
    }

    @Override
    public PokemonType getPokemonName (String name){ return pokemonTypeRepository.findPokemonTypeByName(name);}
}