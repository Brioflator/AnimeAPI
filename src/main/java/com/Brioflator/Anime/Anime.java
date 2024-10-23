package com.Brioflator.Anime;

import com.Brioflator.Genre.Genre;
import com.Brioflator.Studio.Studio;
import com.Brioflator.User.User;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "anime")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id")
    private Long animeId;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="a_name")
    private String animeName;

    @Column(name="a_total_episodes")
    private Long animeTotalEpisodes;

    @Column(name="a_current_episodes")
    private Long animeCurrentEpisodes;

    @Column(name="a_thumbnail")
    private String animeThumbnail;

    @Column(name="a_description")
    private String animeDescription;

    @Column(name="a_updated")
    private Date animeUpdated;

    @Column(name="a_season")
    private Integer animeSeason;

    @Column(name="a_year")
    private Integer animeYear;

    @ManyToMany(mappedBy = "anime")
    private List<User> userLikes;

    @ManyToMany
    @JoinTable(
            name = "anime_studio",
            joinColumns = @JoinColumn(name = "anime_id"),
            inverseJoinColumns = @JoinColumn(name = "studio_id")
    )
    private List<Studio> studios;

    @ManyToMany
    @JoinTable(
            name = "anime_genre",
            joinColumns = @JoinColumn(name = "anime_id"),
            inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;
}
