package com.example.financeApp.service;

import com.example.financeApp.entity.Amount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AmountService {
    List<Amount> getAmounts();
    Amount getAmountById(Long id);
    Amount addAmount(Amount amount);

    void deleteAmountById(Long id);
    Amount updateAmountById(Long id, Amount amount);


}
