package com.example.book_my_show.Models;


import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="movies")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String moviename;

    private double ratings;

    private int duration;

    @Enumerated(value=EnumType.STRING)
    private Language language;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    @OneToMany(mappedBy = "movieEntity",cascade={CascadeType.MERGE, CascadeType.PERSIST})
    private List<ShowEntity> showEntityList = new ArrayList<>();


}
