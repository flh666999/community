package com.nowcoder.community;

import com.nowcoder.community.Config.AlfaConfig;
import com.nowcoder.community.Dao.AlfaDao;
import com.nowcoder.community.Dao.UserMapper;
import com.nowcoder.community.Service.AlfaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class CommunityApplicationTests implements ApplicationContextAware{
	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
	@Test
	public void testApplicationContext(){
		AlfaDao alfaDao=applicationContext.getBean(AlfaDao.class);
		System.out.println(alfaDao.select());

		AlfaDao alfaDao1=applicationContext.getBean("hibernate",AlfaDao.class);
		System.out.println(alfaDao1.select());
	}

	@Test
	public void testApplicationManager(){
		AlfaService alfaService=applicationContext.getBean(AlfaService.class);
		System.out.println(alfaService);
	}
	@Test//导入一个现有的bean
	public void testConfiguration(){
		SimpleDateFormat simpleDateFormat=
				applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}

	@Autowired
	private AlfaDao alfa1;

	@Autowired
	@Qualifier("hibernate")
	private AlfaDao alfa2;

	@Autowired
	private AlfaService alfaService;

	@Autowired
	private AlfaConfig alfaConfig;

	@Test
	public void testDI(){
		System.out.println(alfa1);
		System.out.println(alfa2);
		System.out.println(alfaService);
		System.out.println(alfaConfig);
	}

}
