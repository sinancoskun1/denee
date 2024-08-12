package com.example.rickmorty.service;


import com.example.rickmorty.repository.CharacterRepository;
import com.example.rickmorty.response.CharacterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.events.Characters;
import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    @Autowired
    private ApiService apiService; // API'den veri çekmek için

    public void saveCharacters() {

        CharacterResponse response = apiService.getCharacterData();
        List<Characters> characters = response.getResults(); // API'den dönen veriyi al


        characterRepository.saveAll(characters);
    }
}