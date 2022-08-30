package com.nocoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMybaitsImpl implements AlphaDao {
    @Override
    public String select() {
        return "Mybaits";
    }
}
