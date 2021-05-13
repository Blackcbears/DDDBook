package com.cuijing.bank.persistence;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
/**
 * @author CuiJIng
 * @date 2021-5-13 10:48
 */
@Entity
@Table(name="account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountDO {
    @Id
    @GeneratedValue
    private Long id;
    private String accountNumber;
    private Long userId;
    private BigDecimal available;
    private BigDecimal dailyLimit;
    private String currency;


}
