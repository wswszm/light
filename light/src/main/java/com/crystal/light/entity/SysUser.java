package com.crystal.light.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class SysUser implements Serializable {
    private String id;

    private String username;

    private String password;

    private static final long serialVersionUID = 1L;

}