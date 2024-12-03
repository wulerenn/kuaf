package com.kuaf.system.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 系统用户实体
 *
 * @author Arkin
 * @since 2024-12-02
 */
@Data
public class SysUser implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @Schema(description = "x")
    private Long id;

    /**
     * x
     */
    @Schema(description = "x")
    private String name;

    /**
     * x
     */
    @Schema(description = "x")
    private Long parentId;

    /**
     * x
     */
    @Schema(description = "x")
    private Integer sort;

    /**
     * x
     */
    @Schema(description = "x")
    private Long leader_user_id;

    /**
     * x
     */
    @Schema(description = "x")
    private String phone;

    /**
     * x
     */
    @Schema(description = "x")
    private String email;

    /**
     * x
     */
    @Schema(description = "x")
    private Integer status;

    /**
     * x
     */
    @Schema(description = "x")
    private Long createBy;

    /**
     * x
     */
    @Schema(description = "x")
    private LocalDateTime createDt;

    /**
     * x
     */
    @Schema(description = "x")
    private Long updateBy;

    /**
     * x
     */
    @Schema(description = "x")
    private LocalDateTime updateDt;

    /**
     * x
     */
    @Schema(description = "x")
    private Boolean deleted;

    /**
     * x
     */
    @Schema(description = "x")
    private Long tenantId;
}
