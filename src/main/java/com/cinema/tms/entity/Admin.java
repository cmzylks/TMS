package com.cinema.tms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true) //开启链式调用
@TableName("t_admin")
public class Admin {
    @TableId("admin_id")
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private String phone;
    private String birthday;
    private String avatar;
}
