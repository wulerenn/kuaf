package com.kuaf.framework.core.base.entity;


import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 接口响应返回实体
 *
 * @author Arkin
 * @since 2024-06-01
 */
@Data
public class RespResult<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * code
     */
    private Integer code;

    /**
     * msg
     */
    private String msg;

    /**
     * data
     */
    private T data;

}
