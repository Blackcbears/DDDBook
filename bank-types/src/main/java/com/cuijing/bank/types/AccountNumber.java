package com.cuijing.bank.types;

import com.cuijing.bank.ddd.ValueObject;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author CuiJIng
 * @date 2021-5-13 9:25
 */
@Getter
@EqualsAndHashCode
@ToString
public class AccountNumber implements ValueObject {
    private final String value;

    public AccountNumber(String value) {
        this.value = value;
    }


}