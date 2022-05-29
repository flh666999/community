package com.nowcoder.community.Service;

import com.nowcoder.community.Dao.AlfaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlfaService {
    @Autowired
    private AlfaDao alfaDao;

    public AlfaService(){
        System.out.println("AlfaService实例化");
    }
    @PostConstruct
    public void init(){
        System.out.println("AlfaService初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("AlfaService被销毁");
    }

    public String find(){
        return alfaDao.select();
    }
}
