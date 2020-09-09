package com.springframework.samplecommanddemo.inventory.model;

import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-31.
 */
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
