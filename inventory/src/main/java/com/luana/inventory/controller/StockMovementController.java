package com.luana.inventory.controller;

import com.luana.inventory.model.MovementType;
import com.luana.inventory.model.StockMovement;
import com.luana.inventory.service.StockMovementService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/movements")
public class StockMovementController {

    private final StockMovementService service;

    public StockMovementController(StockMovementService service) {
        this.service = service;
    }

    @PostMapping
    public StockMovement register(
            @RequestParam Long productId,
            @RequestParam MovementType type,
            @RequestParam int quantidade) {

        return service.register(productId, type, quantidade);
    }
}