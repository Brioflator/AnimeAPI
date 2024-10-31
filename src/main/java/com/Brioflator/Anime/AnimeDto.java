package com.Brioflator.Anime;

import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Date;

@Data
@Builder
@RequiredArgsConstructor
public class AnimeDto {
    private String animeName;
    private Long animeTotalEpisodes;
    private Long animeCurrentEpisodes;
    private String animeThumbnail;
    private String animeDescription;
    private Integer animeSeason;
    private Date animeUpdated;
    private Integer animeYear;
}
