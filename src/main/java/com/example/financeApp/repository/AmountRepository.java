package com.example.financeApp.repository;

import com.example.financeApp.entity.Amount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AmountRepository extends JpaRepository<Amount, Long> {

}
