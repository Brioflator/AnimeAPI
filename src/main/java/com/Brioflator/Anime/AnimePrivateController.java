package com.Brioflator.Anime;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/anime_private")
@RequiredArgsConstructor
public class AnimePrivateController {

    private final AnimeService animeService;

    @PostMapping("/add")
    public ResponseEntity<Anime> addAnime(){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anime> updateAnimeName(@PathVariable Long id,
                                                 @RequestParam(required = false) String name,
                                                 @RequestParam(required = false) String description,
                                                 @RequestParam(required = false) String thumbnail,
                                                 @RequestParam(required = false) Integer season,
                                                 @RequestParam(required = false) Integer year,
                                                 @RequestParam(required = false) Long totalEpisodes,
                                                 @RequestParam(required = false) Long currentEpisode
                                                 ){
        AnimeDto animeDto = AnimeDto.builder()
                .animeName(name)
                .animeDescription(description)
                .animeThumbnail(thumbnail)
                .animeSeason(season)
                .animeYear(year)
                .animeTotalEpisodes(totalEpisodes)
                .animeCurrentEpisodes(currentEpisode)
                .build();

        animeService.updateAnime(id, animeDto);
        return ;
    }

}
