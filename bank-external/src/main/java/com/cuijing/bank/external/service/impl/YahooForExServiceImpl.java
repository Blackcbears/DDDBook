package com.cuijing.bank.external.service.impl;

import com.cuijing.bank.external.service.YahooForExService;
import com.cuijing.bank.types.Currency;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
/**
 * @author CuiJIng
 * @date 2021-5-13 14:04
 */
@Component
public class YahooForExServiceImpl implements YahooForExService {

    @Override
    public BigDecimal getExchangeRate(Currency sourceCurrency, Currency targetCurrency) {
        return BigDecimal.ONE;
    }
}
