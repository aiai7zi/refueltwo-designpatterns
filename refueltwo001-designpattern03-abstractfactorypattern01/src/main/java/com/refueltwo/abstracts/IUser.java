package com.refueltwo.abstracts;

import com.refueltwo.po.UserPo;

/**
 * @ClassName IUser
 * @See
 * @Author tanji
 * @Date 2019/12/10 23:05
 * @Version V1.0
 **/

public interface IUser {
    public void insert(UserPo userPo);
    UserPo getUser(String uid);
}
