package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{

    /*
    ShowSeatType    Show
        1             1
        M             1

        M:M
     */
    @ManyToOne
    private Show show;
    private String seatTye;
    private int price;

}
