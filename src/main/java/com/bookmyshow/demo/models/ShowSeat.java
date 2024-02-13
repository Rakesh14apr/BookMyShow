package com.bookmyshow.demo.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{
    /*
    ShowSeat    Show
      1          1
      M          1

      M:1
     */
    @ManyToOne
    private Show show;
    /*
    ShowSeat    Seat
      1          1
      M           1

      M:1
     */
    @ManyToOne
    private Seat seat;
    /*
    ShowSeat    SeatStatus
     1              1
     M              1
     */
    @Enumerated(EnumType.ORDINAL)
    private SeatStatus status;


    private Date lockedAt;

}
