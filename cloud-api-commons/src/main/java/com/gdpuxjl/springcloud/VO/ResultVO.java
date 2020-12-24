package com.gdpuxjl.springcloud.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xujianlin
 * @version 1.0
 * @date 2020/12/16 11:24
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultVO<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public ResultVO(int code, String message){
        this(code,message,null);
    }
}
