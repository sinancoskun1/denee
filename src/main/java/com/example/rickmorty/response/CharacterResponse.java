package com.example.rickmorty.response;





import javax.xml.stream.events.Characters;
import java.util.List;

public class CharacterResponse {
    private List<Characters> results;

    public List<Characters> getResults() {
        return results;
    }

    public void setResults(List<Characters> results) {
        this.results = results;
    }
}
