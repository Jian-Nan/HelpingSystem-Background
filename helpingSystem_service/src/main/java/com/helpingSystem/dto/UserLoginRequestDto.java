package com.helpingSystem.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * C端用户登录
 */
@Data
public class UserLoginRequestDto {

    @ApiModelProperty("昵称")
    private String nickName;

    @ApiModelProperty("登录临时凭证")
    private String code;

    @ApiModelProperty("手机号临时凭证")
    private String phoneCode;
}
