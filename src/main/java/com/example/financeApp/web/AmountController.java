package com.example.financeApp.web;

import com.example.financeApp.entity.Amount;
import com.example.financeApp.service.AmountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/amount")
public class AmountController {
    private final AmountService amountService;


    public AmountController(AmountService amountService) {
        this.amountService = amountService;
    }
    @GetMapping("/amounts")
    public ResponseEntity<List<Amount>> getAmounts() {
        return new ResponseEntity<>(amountService.getAmounts(), HttpStatus.OK);
    }


}
