package com.example.rickmorty.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.xml.stream.events.Characters;

@Repository
public interface CharacterRepository extends JpaRepository<Characters, Long> {
}