package com.refueltwo.state;

import com.refueltwo.context.Context;

/**
 * @ClassName State
 * @See
 * @Author tanji
 * @Date 2019/12/17 20:42
 * @Version V1.0
 **/

public abstract class State {
  public abstract void handle(Context context);
}
