package com.Brioflator.Anime;

import com.Brioflator.Genre.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AnimeRepository extends CrudRepository<Anime, Long> {

    Optional<Anime> findByAnimeId(Long aLong);
    List<Anime> searchAnimeByAnimeName(String name);
    List<Anime> findAllByGenresContains(Genre genres);
    List<Anime> findAllByAnimeYear(Integer year);
}
