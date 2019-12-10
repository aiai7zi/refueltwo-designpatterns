package com.refueltwo.abstracts.impl;

import com.refueltwo.abstracts.ILogin;
import com.refueltwo.po.LoginPo;

/**
 * @ClassName MysqlILogin
 * @See
 * @Author tanji
 * @Date 2019/12/11 1:42
 * @Version V1.0
 **/

public class MysqlILogin implements ILogin {
    @Override
    public void insert(LoginPo loginPo) {
        System.out.println("mysql添加了一条登陆信息");
    }

    @Override
    public LoginPo getLogin(String lid) {
        System.out.println("mysql获取了一条登陆信息");
        return null;
    }
}
