package com.bookmyshow.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel {

    private String name;
    /*
        Screen      Seat
        1           M
        1            1

        1:M
     */
    @OneToMany
    private List<Seat> seats;
    /*
        Screen      Feature
        1           M
        M            1

        M:M
     */

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

}
