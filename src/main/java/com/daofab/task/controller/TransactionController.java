package com.daofab.task.controller;

import com.daofab.task.dto.ChildResponseDto;
import com.daofab.task.dto.ParentResponseDto;
import com.daofab.task.service.TransactionService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TransactionController {
//    private final TransactionService transactionService;

    @GetMapping("/transaction")
//    public ParentResponseDto transactions(){
        public String transactions(){
//        ParentResponseDto parentDTO = new ParentResponseDto();
//        return transactionService.getTransactionData();
        String s = "transaction";
        return s;
    }

//    @GetMapping("/child")
//    public ChildResponseDto transaction(){
//        List<ChildResponseDto> childDTO = new ArrayList<>();
//        return transactionService.getChildData();
//    }

}
