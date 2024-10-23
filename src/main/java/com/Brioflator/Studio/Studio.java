package com.Brioflator.Studio;

import com.Brioflator.Anime.Anime;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "studio")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Studio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private Long studioId;

    @Column(name = "s_name")
    private String studioName;

    @ManyToMany(mappedBy = "studio")
    private List<Anime> animes;
}