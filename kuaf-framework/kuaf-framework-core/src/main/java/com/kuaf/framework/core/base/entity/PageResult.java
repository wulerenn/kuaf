package com.kuaf.framework.core.base.entity;

import java.io.Serial;
import java.io.Serializable;

/**
 * 分页查询结果
 *
 * @author Arkin
 * @since 2024-06-01
 */
public class PageResult<T> extends RespResult<T> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * page info
     */
    private PageInfo pageInfo;
}
