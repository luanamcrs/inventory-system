package com.luana.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luana.inventory.model.StockMovement;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {
}