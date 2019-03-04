package com.rhiodamuthie.eyemusicstudio.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "eye_Band")
public class Band {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BAND_SEQ")
    @SequenceGenerator(sequenceName = "band_seq", allocationSize = 1, name = "BAND_SEQ")
    private Long id;

    private Date createdAt;


    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "musician_band",
            joinColumns = @JoinColumn(name = "band_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "musician_id", referencedColumnName = "id"))
    private Set<Musician> musicians;


}
