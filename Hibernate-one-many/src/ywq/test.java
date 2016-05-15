package ywq;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Grade;
import entity.Student;
 


public class test {
	public static void main(String[] args) {
		add();
		//findStudentsByGrade();
		//update();
		//delete();
		
	}
	
 
	public static void add(){
		Grade g=new Grade("Java ", "Java  yy");
		Student stu1=new Student("ywq","q");
		Student stu2=new Student("ys","y");
		
		//如果希望在学生表中添加对应的班级编号，需要在班级中添加学生，建立关联关系
		/*g.getStudents().add(stu1);
		g.getStudents().add(stu2);*/
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		session.save(g);
		session.save(stu1);
		session.save(stu2);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
	
	 
	public static void findStudentsByGrade(){
		Session session=HibernateUtil.getSession();
		Grade grade=(Grade) session.get(Grade.class, 1);
		System.out.println(grade.getGname()+","+grade.getGdesc());
		
		/*Set<Student> students=grade.getStudents();
		for(Student stu:students){
			System.out.println(stu.getSname()+","+stu.getSex());
		}*/
	}
 
	public static void update(){
		Grade g=new Grade("Java 1", "Java11111");
		
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, 1);
		//g.getStudents().add(stu);
		session.save(g);
		tx.commit();
		HibernateUtil.closeSession(session);
	}

 
	public static void delete(){
		Session session=HibernateUtil.getSession();
		Transaction tx=session.beginTransaction();
		Student stu=(Student) session.get(Student.class, 2);
		session.delete(stu);
		tx.commit();
		HibernateUtil.closeSession(session);
	}
}
