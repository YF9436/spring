package dao.impl;



import org.springframework.stereotype.Repository;

import dao.studentDao;
@Repository
public class StudentDaoImpl implements studentDao{
	

	@Override
	public String add() {
		System.out.println("ѧ��GG");
		return "�ײ�";
	}
	public static void main(String[] args) {
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		String a = daoImpl.add();
		System.out.println(a);
	}

}
