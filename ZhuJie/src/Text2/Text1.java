package Text2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.impl.StudentDaoImpl;

import service.impl.serviceDaoImpl;



public class Text1 {
	


	@Test
	public void text1(){
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		serviceDaoImpl logger=(serviceDaoImpl)a.getBean("serviceDao");
		logger.add();
	}
	@Test
	public void text2(){
		ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentDaoImpl logger=(StudentDaoImpl)a.getBean("studentDaoImpl");
		String a1 = logger.add();
		System.out.println(a1);
	}
}
