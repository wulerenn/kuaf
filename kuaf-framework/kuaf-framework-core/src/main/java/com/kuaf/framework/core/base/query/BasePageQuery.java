package com.kuaf.framework.core.base.query;

/**
 * 分页查询基类
 *
 * @author Arkin
 * @since 2024-06-01
 */
public class BasePageQuery {

    /**
     * 页码|1
     */
    private Integer pageNum = 1;

    /**
     * 每页记录数 不传默认查全部|10
     */
    private int pageSize = -1;

    /**
     * 排序的字段（列）名|userId
     */
    private String sortBy;

    /**
     * 排序规则asc(升序)、desc(降序)|asc
     */
    private String sortDir;

    //private BasePageExport exportParam;

}
