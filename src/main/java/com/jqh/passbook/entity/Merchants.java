package com.jqh.passbook.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: jiang qiang hua
 * @Description:<h1>商户对象模型</h1>
 * @Date: Create in 1:01 2019/1/13
 * @Modified By:
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="merchants")
public class Merchants {

    @Id
    @GeneratedValue // 表示可以不设置，自动生成
    @Column(name="id",nullable = false)
    private Integer id ;

    /**
     * 商户名称
     */
    @Basic
    @Column(name="name",unique = true, nullable = false)
    private String name ;

    /**
     * 商户 logo 地址
     */
    @Basic
    @Column(name="logo_url", nullable = false)
    private String logoUrl ;

    /**
     * 商户营业执照
     */
    @Basic
    @Column(name="business_license_url",nullable = false)
    private String business_license_url ;

    /**
     * 商户联系
     */
    @Basic
    @Column(name = "phone" , nullable = false)
    private String phone ;

    /**
     * 商户地址
     */
    @Basic
    @Column(name = "address" , nullable = false)
    private String address ;

    /**
     * 商户是否通过审核
     */
    @Basic
    @Column(name = "ia_audit" , nullable = false )
    private boolean isAudit = false;
}
