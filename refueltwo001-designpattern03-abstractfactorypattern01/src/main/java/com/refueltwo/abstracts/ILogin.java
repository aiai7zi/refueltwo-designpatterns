package com.refueltwo.abstracts;

import com.refueltwo.po.LoginPo;

public interface ILogin {
    void insert(LoginPo loginPo);
    LoginPo getLogin(String lid);
}
