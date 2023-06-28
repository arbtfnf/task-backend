package com.daofab.task.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;

@Entity
public class ChildEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private long id;
    @Column(nullable = false)
    private long parentId;
    @Column(nullable = false)
    private String sender;
    @Column(nullable = false)
    private String receiver;
    @Column(nullable = false)
    private int totalAmount;
    @Column(nullable = false)
    private int amountPaid;
}
