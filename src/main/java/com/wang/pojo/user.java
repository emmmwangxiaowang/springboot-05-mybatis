package com.wang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/10/6 0006
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class user
{
    private Integer id;
    private String  name;
    private String  pwd;
}
