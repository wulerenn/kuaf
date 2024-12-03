package com.kuaf.framework.core.base.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * <p><分页信息实体</p>
 *
 * @author Arkin
 * @since 2024-06-01
 */
@Data
public class PageInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 当前页，默认第一页
     */
    private Integer pageNum = 1;

    /**
     * 每页条数
     */
    private Integer pageSize = 10;

    /**
     * 总页数
     */
    private Integer totalPage = 0;

    /**
     * 总记录数
     */
    private Integer totalCount = 0;

}
