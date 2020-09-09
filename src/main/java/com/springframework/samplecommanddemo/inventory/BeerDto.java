package com.springframework.samplecommanddemo.inventory;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Builder
public class BeerDto implements Serializable {

    static final long serialVersionUID = -733918718940992414L;

    private UUID id;

    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private String upc;

    private Integer quantityOnHand;

    private BigDecimal price;

}
