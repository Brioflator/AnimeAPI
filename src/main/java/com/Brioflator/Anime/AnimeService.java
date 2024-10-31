package com.Brioflator.Anime;

import com.Brioflator.Genre.Genre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public Anime getAnimeById(Long Id){
        return animeRepository.findByAnimeId(Id).orElseThrow(() -> new RuntimeException("Anime not found"));
    }

    public List<Anime> getAnimesByGenre(Genre genre) {
        return animeRepository.findAllByGenresContains(genre);
    }

    public List<Anime> getAnimeByName(String name) {
        return animeRepository.searchAnimeByAnimeName(name);
    }

    public Anime updateAnime(Long id, AnimeDto animeDto) {
        Anime anime = getAnimeById(id);

        if (getAnimeById(id) == null) {
            throw new RuntimeException("Anime not found");
        }

        if (animeDto.getAnimeName() != null) {
            anime.setAnimeName(animeDto.getAnimeName());
        }
        if (animeDto.getAnimeTotalEpisodes() != null) {
            anime.setAnimeTotalEpisodes(animeDto.getAnimeTotalEpisodes());
        }
        if (animeDto.getAnimeCurrentEpisodes() != null) {
            anime.setAnimeCurrentEpisodes(animeDto.getAnimeCurrentEpisodes());
        }
        if (animeDto.getAnimeThumbnail() != null) {
            anime.setAnimeThumbnail(animeDto.getAnimeThumbnail());
        }
        if (animeDto.getAnimeDescription() != null) {
            anime.setAnimeDescription(animeDto.getAnimeDescription());
        }
        if (animeDto.getAnimeSeason() != null) {
            anime.setAnimeSeason(animeDto.getAnimeSeason());
        }
        if (animeDto.getAnimeYear() != null) {
            anime.setAnimeYear(animeDto.getAnimeYear());
        }

        return animeRepository.save(anime);
    }
}
