package com.dragon.hei.wsth.promote.spi.test;

import com.dragon.hei.wsth.mapper.po.TmpUser;

public class SpiFunctionImpl2 implements SpiFunction {
    @Override
    public void addUser(TmpUser user) {
        System.out.println("[SpiFunctionImpl2]:add... user...");
    }
}
