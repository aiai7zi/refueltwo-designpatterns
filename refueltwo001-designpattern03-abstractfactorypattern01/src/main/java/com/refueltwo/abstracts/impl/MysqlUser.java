package com.refueltwo.abstracts.impl;

import com.refueltwo.abstracts.IUser;
import com.refueltwo.po.UserPo;

/**
 * @ClassName MysqlUser
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:08
 * @Version V1.0
 **/

public class MysqlUser implements IUser {
    @Override
    public void insert(UserPo userPo) {
        System.out.println("mysql数据库插入了user用户");
    }

    @Override
    public UserPo getUser(String uid) {
        System.out.println("mysql数据库获取了user用户");
        return null;
    }
}
