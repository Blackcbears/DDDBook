package com.cuijing.bank.external;

import com.cuijing.bank.types.Currency;
import com.cuijing.bank.types.ExchangeRate;

/**
 * @author CuiJIng
 * @date 2021-5-13 10:04
 */
public interface ExchangeRateService {
    ExchangeRate getExchangeRate(Currency source, Currency target);
}
