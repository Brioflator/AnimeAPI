package com.Brioflator.Anime;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/anime")
@RequiredArgsConstructor
public class AnimeController {

    private final AnimeService animeService;

    @GetMapping("/{id}")
    public Anime getAnimeById(@PathVariable Long id){
        return animeService.getAnimeById(id);
    }

    @GetMapping("/{name}")
    public List<Anime> getAnimeByName(@PathVariable String name){
        return animeService.getAnimeByName(name);
    }

}
