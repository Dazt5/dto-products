package com.dazt.ms.products.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ProductDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 02-11-2022
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class ProductDto {

    /** id. */
    private BigInteger id;
    /** name. */
    private String name;
    /** description. */
    private String description;
    /** stock. */
    private Integer stock;
    /** price. */
    private BigDecimal price;
    /** updateTime. */
    private LocalDateTime updateTime;
    /** createTime. */
    private LocalDateTime createTime;
}