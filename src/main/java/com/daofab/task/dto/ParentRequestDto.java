package com.daofab.task.dto;

import java.io.Serial;
import java.io.Serializable;

public class ParentRequestDto implements Serializable {
//    @Serial
//    private static final long serialVersionUID = 1L;
    private long id;
    private String sender;
    private String receiver;
    private int totalAmount;
}
