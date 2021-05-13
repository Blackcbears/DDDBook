package com.cuijing.bank.domain.types;

import com.cuijing.bank.domain.entity.Account;
import com.cuijing.bank.types.AccountNumber;
import com.cuijing.bank.types.Money;
import com.cuijing.bank.types.UserId;

import java.time.LocalDate;
import java.util.Date;
/**
 * @author CuiJIng
 * @date 2021-5-13 9:57
 */
public class AuditMessage {
    private final UserId userId;
    private final AccountNumber source;
    private final AccountNumber target;
    private final Money money;
    private final LocalDate date;

    public AuditMessage(UserId userId, Account sourceAccount, Account targetAccount, Money targetMoney) {
        this.userId = userId;
        this.source = sourceAccount.getAccountNumber();
        this.target = targetAccount.getAccountNumber();
        this.money = targetMoney;
        this.date =LocalDate.now();
    }

    public String serialize() {
        return userId + "," + source + "," + target + "," + money + "," + date;
    }

    public static AuditMessage deserialize(String value) {
        // todo
        return null;
    }
}