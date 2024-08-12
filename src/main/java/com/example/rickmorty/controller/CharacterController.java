package com.example.rickmorty.controller;

import com.example.rickmorty.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/import")
    public String importCharacters() {
        characterService.saveCharacters();
        return "Characters imported successfully!";
    }
}