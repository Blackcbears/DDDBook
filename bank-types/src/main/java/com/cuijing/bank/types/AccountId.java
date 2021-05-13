package com.cuijing.bank.types;

import com.cuijing.bank.ddd.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author CuiJIng
 * @date 2021-5-13 9:24
 */
@Getter
@EqualsAndHashCode
@ToString
public class AccountId implements ValueObject {
    private final Long value;

    public AccountId(Long value) {
        this.value = value;
    }


}
