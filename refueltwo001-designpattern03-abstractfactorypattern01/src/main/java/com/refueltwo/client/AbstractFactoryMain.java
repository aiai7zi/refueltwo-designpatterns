package com.refueltwo.client;

import com.refueltwo.abstracts.ILogin;
import com.refueltwo.abstracts.IUser;
import com.refueltwo.factory.SqlFactory;
import com.refueltwo.factory.imlp.MysqlFactory;

/**
 * @ClassName AbstractFactoryMain
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:19
 * @Version V1.0
 **/

public class AbstractFactoryMain {
    public static void main(String[] args) {
        SqlFactory mysqlFactory=new MysqlFactory();
        IUser user = mysqlFactory.createUser();
        System.out.println(user.getUser("1"));
        ILogin login = mysqlFactory.createLogin();
        System.out.println(login.getLogin("1"));

    }
}
