package com.example.rickmorty.service;


import com.example.rickmorty.response.CharacterResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ApiService {
    public CharacterResponse getCharacterData() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<CharacterResponse> response = restTemplate.getForEntity(
                "https://rickandmortyapi.com/api/character",
                CharacterResponse.class
        );
        return response.getBody();
    }
}



