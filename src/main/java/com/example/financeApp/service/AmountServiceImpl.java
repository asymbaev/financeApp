package com.example.financeApp.service;

import com.example.financeApp.entity.Amount;
import com.example.financeApp.repository.AmountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AmountServiceImpl implements AmountService {

    private final AmountRepository amountRepository;

    public AmountServiceImpl(AmountRepository amountRepository) {
        this.amountRepository = amountRepository;
    }

    @Override
    public List<Amount> getAmount() {
        return amountRepository.findAll();
    }

    @Override
    public Amount getAmountById(Long id) {
        Optional<Amount> optionalAmount = amountRepository.findById(id);

        if (optionalAmount.isPresent()) {
            return optionalAmount.get();
        } else {
            throw new RuntimeException("Amount with " + id + "not found ");

        }
    }

    @Override
    public Amount addAmount(Amount amount) {
        return amountRepository.save(amount);
    }

    @Override
    public void deleteAmountById(Long id) {
        amountRepository.deleteById(id);

    }

    @Override
    public Amount updateAmountById(Long id, Amount amount) {
        Amount existingAmount = getAmountById(id);
        existingAmount.setId(amount.getId());
        existingAmount.setAmount(amount.getAmount());
        existingAmount.setHistory(amount.getHistory());
        amountRepository.save(existingAmount);
        return existingAmount;
    }
}
