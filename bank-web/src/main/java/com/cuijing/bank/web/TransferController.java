package com.cuijing.bank.web;

import com.cuijing.bank.application.TransferService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;

/**
 * @author CuiJIng
 * @date 2021-5-13 11:48
 */
@Api(value = "报账", tags = "报账接口")
@RestController
public class TransferController {
    @Resource
    private TransferService transferService;


    @ApiOperation(value = "111", httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "targetAccountNumber", value = "(true-强制更新 false-不强制更新)", paramType = "query", required = true, dataType = "String"),
            @ApiImplicitParam(name = "amount", value = "版本号 如: 100", paramType = "query", required = true, dataType = "BigDecimal"),})
    @RequestMapping(value = "/a")
    public boolean transfer(String targetAccountNumber, BigDecimal amount, @NotNull HttpSession session) {
        long userId;
        userId = 1L;
        return transferService.transfer(userId, targetAccountNumber, amount, "CNY");
    }

    @ApiOperation(value = "2222", httpMethod = "GET")
    @RequestMapping(value = "/b")
    public String test(String accountNumber, String currency, BigDecimal dailyLimit) {
        return transferService.createAccount(accountNumber, currency, dailyLimit);
    }
}