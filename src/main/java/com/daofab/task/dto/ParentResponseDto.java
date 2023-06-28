package com.daofab.task.dto;

import java.io.Serial;
import java.io.Serializable;

public class ParentResponseDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String sender;
    private String receiver;
    private int totalAmount;
    private int totalAmountPaid;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmountPaid() {
        return totalAmountPaid;
    }

    public void setTotalAmountPaid(int totalAmountPaid) {
        this.totalAmountPaid = totalAmountPaid;
    }

}
