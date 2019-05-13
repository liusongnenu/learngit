package edu.nenu.onlineExam.studentuser.service;

import org.springframework.transaction.annotation.Transactional;

import edu.nenu.onlineExam.studentuser.dao.StudentUserDao;
import edu.nenu.onlineExam.studentuser.entity.AdminUser;

@Transactional
public class StudentUserService {
	
	private StudentUserDao studentUserDao;

	public void setStudentUserDao(StudentUserDao studentUserDao) {
		this.studentUserDao = studentUserDao;
	}
	
	//����Ա��¼��֤
	public StudentUser login(StudentUser student) {
		return studentUserDao.login(student);
	}

	public void updatePW(Integer uid, String npw) {
		studentnUserDao.updatePW(uid,npw);
	}

}
