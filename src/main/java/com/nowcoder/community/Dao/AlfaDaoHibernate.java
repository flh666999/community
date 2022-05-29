package com.nowcoder.community.Dao;

import org.springframework.stereotype.Repository;

@Repository("hibernate")
public class AlfaDaoHibernate implements AlfaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
