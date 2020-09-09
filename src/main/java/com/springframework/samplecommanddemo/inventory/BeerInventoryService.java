package com.springframework.samplecommanddemo.inventory;

import com.springframework.samplecommanddemo.inventory.model.BeerInventory;

public interface BeerInventoryService {
    BeerInventory getOnInventory(String beerId);
    Integer getOnHandInventory(String beerId);
}
