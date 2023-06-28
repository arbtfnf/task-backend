package com.daofab.task.dto;

import java.io.Serial;
import java.io.Serializable;

public class ChildRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String parentId;
    private int amountPaid;
}
