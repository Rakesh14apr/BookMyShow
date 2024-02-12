package com.bookmyshow.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment extends BaseModel {

    private String refNo;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus status;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentGateWayProvider paymentGateWayProvider;
    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;
}
