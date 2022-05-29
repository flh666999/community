package com.nowcoder.community.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlfaDaoMybatis implements AlfaDao {

    @Override
    public String select() {
        return "Mybatis";
    }
}
