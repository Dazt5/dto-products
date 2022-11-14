package com.dazt.ms.products.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * TestCategoryDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 12-11-2022
 */
class TestCategoryDto {

    @Test
    void testBuilder(){
        final var now = LocalDateTime.now();
        final var to = CategoryDto.builder()
            .id(BigInteger.ONE)
            .categoryCode("ELECTRONIC")
            .name("electronics")
            .description("description")
            .createTime(now)
            .updateTime(now)
            .build();
        Assertions.assertEquals(BigInteger.ONE,to.getId());
        Assertions.assertEquals("ELECTRONIC",to.getCategoryCode());
        Assertions.assertEquals("electronics",to.getName());
        Assertions.assertEquals("description",to.getDescription());
        Assertions.assertEquals(now,to.getCreateTime());
        Assertions.assertEquals(now,to.getUpdateTime());
    }

    @Test
    void testGetterSetters(){
        final var now = LocalDateTime.now();
        final var to = new CategoryDto();
        to.setId(BigInteger.ONE);
        to.setCategoryCode("ELECTRONIC");
        to.setName("electronics");
        to.setDescription("description");
        to.setCreateTime(now);
        to.setUpdateTime(now);
        Assertions.assertEquals(BigInteger.ONE,to.getId());
        Assertions.assertEquals("ELECTRONIC",to.getCategoryCode());
        Assertions.assertEquals("electronics",to.getName());
        Assertions.assertEquals("description",to.getDescription());
        Assertions.assertEquals(now,to.getCreateTime());
        Assertions.assertEquals(now,to.getUpdateTime());
    }

}