package com.refueltwo.factory.imlp;

import com.refueltwo.abstracts.ILogin;
import com.refueltwo.abstracts.IUser;
import com.refueltwo.abstracts.impl.MysqlILogin;
import com.refueltwo.abstracts.impl.MysqlUser;
import com.refueltwo.factory.SqlFactory;

/**
 * @ClassName MysqlFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:16
 * @Version V1.0
 **/

public class MysqlFactory implements SqlFactory {
    @Override
    public IUser createUser() {
        return new MysqlUser();
    }

    @Override
    public ILogin createLogin() {
        return new MysqlILogin();
    }
}
