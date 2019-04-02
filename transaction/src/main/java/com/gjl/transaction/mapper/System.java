
package com.gjl.transaction.mapper;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "system")
@Data
public class System implements Serializable {
    private static final long serialVersionUID = 1L;
    /**  */
    @Id
    private Long id;

    /** 系统code */
    @Column(name = "code")
    private String code;

    /** 系统名称 */
    @Column(name = "name")
    private String name;

    /** 系统url */
    @Column(name = "url")
    private String url;

    /** 描述 */
    @Column(name = "remark")
    private String remark;

    /**  */
    @Column(name = "create_time")
    private Date createTime;

    /**  */
    @Column(name = "create_by")
    private Long createBy;

    /**  */
    @Column(name = "update_time")
    private Date updateTime;

    /**  */
    @Column(name = "update_by")
    private Long updateBy;


}
