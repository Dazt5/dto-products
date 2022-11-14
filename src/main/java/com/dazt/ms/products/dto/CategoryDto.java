package com.dazt.ms.products.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CategoryDto.
 *
 * @author David Alvarez.
 * @version 1.0.0, 12-11-2022
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class CategoryDto {

    /** id. */
    private BigInteger id;
    /** categoryCode. */
    private String categoryCode;
    /** name. */
    private String name;
    /** description. */
    private String description;
    /** updateTime. */
    private LocalDateTime updateTime;
    /** createTime. */
    private LocalDateTime createTime;

}