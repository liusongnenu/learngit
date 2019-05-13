package edu.nenu.onlineExam.studentuser.dao;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import edu.nenu.onlineExam.studentuser.entity.AdminUser;


public class StudentUserDao extends HibernateDaoSupport{
	
	//����Ա��¼��֤
	public StudentUser login(StudentUser student) {
		String hql = "from StudentUser where uid = ? and password = ?";
		List<StudentUser> list = (List<StudentUser>) this.getHibernateTemplate().find(hql, student.getUid(),student.getPassword());
		if(list != null && list.size() > 0){
			return list.get(0);
		}
		return null;
	}

	public void updatePW(Integer uid, String npw) {
		String hql = "from StudentUser where uid =? ";
        StudentUser student = null;
		List<StudentUser> list = (List<StudentUser>) this.getHibernateTemplate().find(hql, uid);
		if(list != null && list.size()>0){
            student = (StudentUser)list.get(0);
		}
        student.setPassword(npw);
		this.getHibernateTemplate().save(student);
	}
}
