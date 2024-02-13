package com.bookmyshow.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@AllArgsConstructor
public class BookShowResponseDto {

    private Long bookingId;
    private int amount;
    private ResponseStatus responseStatus;
    private String failureReason;
}

public enum ResponseStatus{
    SUCCESS, FAILURE
}

