package com.refueltwo.factory.imlp;

import com.refueltwo.abstracts.ILogin;
import com.refueltwo.abstracts.IUser;
import com.refueltwo.abstracts.impl.MysqlUser;
import com.refueltwo.abstracts.impl.OracleILogin;
import com.refueltwo.abstracts.impl.OraclelUser;
import com.refueltwo.factory.SqlFactory;

/**
 * @ClassName MysqlFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:16
 * @Version V1.0
 **/

public class OracleFactory implements SqlFactory {
    @Override
    public IUser createUser() {
        return new OraclelUser();
    }

    @Override
    public ILogin createLogin() {
        return new OracleILogin();
    }
}
