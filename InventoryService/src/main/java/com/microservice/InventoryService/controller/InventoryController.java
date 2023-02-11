package com.microservice.InventoryService.controller;

import com.microservice.InventoryService.dto.InventoryResponse;
import com.microservice.InventoryService.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam String quantity, @RequestParam String productId) {
        return inventoryService.isInStock(Long.parseLong(quantity), Long.parseLong(productId));
    }
}

