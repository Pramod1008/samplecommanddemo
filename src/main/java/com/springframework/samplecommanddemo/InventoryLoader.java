package com.springframework.samplecommanddemo;

import com.springframework.samplecommanddemo.inventory.BeerInventoryService;
import com.springframework.samplecommanddemo.inventory.model.BeerInventory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Slf4j
@Component
public class InventoryLoader implements CommandLineRunner {

    private BeerInventoryService beerInventoryService;

    @Autowired
    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
        this.beerInventoryService = beerInventoryService;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        log.info("Welcome to the Command Line Editor.");

        String getOrSet = scanner.nextLine();

        if("get".equalsIgnoreCase(getOrSet)){
            log.info("Whose info do you want to get?");
           BeerInventory value =getOnInventory("026cc3c8-3a0c-4083-a05b-e908048c1b08");
           log.info("Inventory Beer Id info : "+value.getBeerId());
        }
    }


    private BeerInventory getOnInventory(String s) {
       return beerInventoryService.getOnInventory("026cc3c8-3a0c-4083-a05b-e908048c1b08");
    }

    private Integer getOnHandInventory(String s) {
        return beerInventoryService.getOnHandInventory("026cc3c8-3a0c-4083-a05b-e908048c1b08");
    }

}
