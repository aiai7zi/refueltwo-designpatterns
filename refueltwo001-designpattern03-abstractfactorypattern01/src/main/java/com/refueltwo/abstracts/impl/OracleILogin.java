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

public class OracleILogin implements ILogin {
    @Override
    public void insert(LoginPo loginPo) {
        System.out.println("oracle添加了一条登陆信息");
    }

    @Override
    public LoginPo getLogin(String lid) {
        System.out.println("oracle获取了一条登陆信息");
        return null;
    }
}
