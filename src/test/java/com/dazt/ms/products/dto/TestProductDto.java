/*
 * @(#)TestProductDto.java
 *
 * Copyright (c) BANCO DE CHILE (Chile). All rights reserved.
 *
 * All rights to this product are owned by BANCO DE CHILE and may only
 * be used under the terms of its associated license document. You may NOT
 * copy, modify, sublicense, or distribute this source file or portions of
 * it unless previously authorized in writing by BANCO DE CHILE.
 * In any event, this notice and the above copyright must always be included
 * verbatim with this file.
 */
package com.dazt.ms.products.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TestProductDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 10-11-2022
 */
class TestProductDto {

    @Test
    void testBuilder(){
        final var now = LocalDateTime.now();
        final var to = ProductDto.builder()
            .id(BigInteger.ONE)
            .name("product")
            .description("description")
            .price(BigDecimal.ONE)
            .stock(1)
            .createTime(now)
            .updateTime(now)
            .build();
        Assertions.assertEquals(BigInteger.ONE,to.getId());
        Assertions.assertEquals("product",to.getName());
        Assertions.assertEquals("description",to.getDescription());
        Assertions.assertEquals(BigDecimal.ONE,to.getPrice());
        Assertions.assertEquals(1,to.getStock());
        Assertions.assertEquals(now,to.getCreateTime());
        Assertions.assertEquals(now,to.getUpdateTime());
    }

    @Test
    void testGetterSetters(){
        final var now = LocalDateTime.now();
        final var to = new ProductDto();
        to.setId(BigInteger.ONE);
        to.setName("product");
        to.setDescription("description");
        to.setPrice(BigDecimal.ONE);
        to.setStock(1);
        to.setCreateTime(now);
        to.setUpdateTime(now);
        Assertions.assertEquals(BigInteger.ONE,to.getId());
        Assertions.assertEquals("product",to.getName());
        Assertions.assertEquals("description",to.getDescription());
        Assertions.assertEquals(BigDecimal.ONE,to.getPrice());
        Assertions.assertEquals(1,to.getStock());
        Assertions.assertEquals(now,to.getCreateTime());
        Assertions.assertEquals(now,to.getUpdateTime());
    }

}