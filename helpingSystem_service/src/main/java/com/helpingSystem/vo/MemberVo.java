
package com.helpingSystem.vo;

import com.zzyl.base.BaseVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户信息DTO
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "MemberVO", description = "用户信息DTO")
public class MemberVo extends BaseVo {
    /**
     * 认证id
     */
    @ApiModelProperty(value = "认证id")
    private String authId;
    /**
     * 身份证号
     */
    @ApiModelProperty(value = "身份证号")
    private String idCardNo;
    /**
     * 身份证号是否认证 1认证
     */
    @ApiModelProperty(value = "身份证号是否认证 1认证")
    private Integer idCardNoVerify;
    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号")
    private String phone;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "openId")
    private String openId;

    /**
     * 性别
     */
    @ApiModelProperty(value = "性别")
    private Integer sex;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日")
    private String birthday;

    /**
     * 下单次数
     */
    @ApiModelProperty(value = "下单次数")
    private Integer orderCount;

    /**
     * 是否签约
     */
    @ApiModelProperty(value = "是否签约")
    private String isSign;

    /**
     * 老人姓名
     */
    @ApiModelProperty(value = "老人姓名")
    private String elderNames;

}


