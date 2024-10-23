package com.Brioflator.Genre;


import com.Brioflator.Anime.Anime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="genre")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "g_id")
    private Long genreId;

    @Column(name="g_name")
    private String genreName;

    @ManyToMany(mappedBy = "genre")
    private List<Anime> animes;
}
