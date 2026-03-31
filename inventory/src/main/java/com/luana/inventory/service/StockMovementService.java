package com.luana.inventory.service;

import com.luana.inventory.model.*;
import com.luana.inventory.repository.ProductRepository;
import com.luana.inventory.repository.StockMovementRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class StockMovementService {

    private final StockMovementRepository movementRepository;
    private final ProductRepository productRepository;

    public StockMovementService(StockMovementRepository movementRepository,
                                ProductRepository productRepository) {
        this.movementRepository = movementRepository;
        this.productRepository = productRepository;
    }

    public StockMovement register(Long productId, MovementType type, int quantidade) {

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (type == MovementType.SAIDA && product.getQuantidade() < quantidade) {
            throw new RuntimeException("Estoque insuficiente");
        }

        if (type == MovementType.ENTRADA) {
            product.setQuantidade(product.getQuantidade() + quantidade);
        } else {
            product.setQuantidade(product.getQuantidade() - quantidade);
        }

        productRepository.save(product);

        StockMovement movement = new StockMovement();
        movement.setProduct(product);
        movement.setType(type);
        movement.setQuantidade(quantidade);
        movement.setData(LocalDateTime.now());

        return movementRepository.save(movement);
    }
}