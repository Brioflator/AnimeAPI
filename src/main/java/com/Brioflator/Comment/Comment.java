package com.Brioflator.Comment;

import com.Brioflator.Anime.Anime;
import com.Brioflator.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c_id")
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="anime_id")
    private Anime anime;

    @Column(name = "c_text")
    private String commentText;

    @Column(name = "c_like")
    private Long commentLike;
}
