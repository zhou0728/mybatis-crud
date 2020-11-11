package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ZHOU
 * @create 2020/11/10 17:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private Integer uId;
    private String uName;
    private String uPassword;
    private String uSex;
}
