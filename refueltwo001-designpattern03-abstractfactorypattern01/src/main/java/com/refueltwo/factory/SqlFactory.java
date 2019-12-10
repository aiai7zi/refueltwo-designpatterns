package com.refueltwo.factory;

import com.refueltwo.abstracts.ILogin;
import com.refueltwo.abstracts.IUser;

/**
 * @ClassName SqlFactory
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:13
 * @Version V1.0
 **/

public interface SqlFactory {

    IUser createUser();
    ILogin createLogin();
}
