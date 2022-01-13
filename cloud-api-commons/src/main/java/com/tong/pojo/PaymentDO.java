package com.tong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 童纯盼
 * @date 2022/1/10 9:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentDO {
    private int id;
    private String serial;
}
