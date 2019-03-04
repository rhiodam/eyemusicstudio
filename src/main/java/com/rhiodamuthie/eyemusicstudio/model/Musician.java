package com.rhiodamuthie.eyemusicstudio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "eye_Musician")
public class Musician {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MUSICIAN_SEQ")
    @SequenceGenerator(sequenceName = "musician_seq", allocationSize = 1, name = "MUSICIAN_SEQ")
    private Long id;

    private String name;
    private int age;
    private String genre;

    @JsonIgnore
    @ManyToMany(mappedBy = "musicians")
    private Set<Band> bands = new HashSet<>();
}
