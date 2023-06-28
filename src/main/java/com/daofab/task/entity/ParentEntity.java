package com.daofab.task.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class ParentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    private String sender;
    private String receiver;
    private int totalAmount;
    private int totalAmountPaid;
}
