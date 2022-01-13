package com.tong.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 童纯盼
 * @date 2022/1/10 9:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Common<T> {
    private Integer code;
    private String message;
    private T data;

    public Common(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
