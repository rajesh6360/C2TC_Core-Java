package com.cg.jpacrud.service;

import com.cg.jpacrud.entity.Student;
import com.cg.jpacrud.dao.StudentDao;
import com.cg.jpacrud.dao.StudentDaoImpl;
import javax.persistence.Entity;
import javax.persistence.ManyToOne; 

@Entity
public class StudentServiceImpl implements StudentService 
{ 
 @ManyToOne
private StudentDao dao; 
 
 public StudentServiceImpl()         
 {  
	 dao = new StudentDaoImpl();
	 } 
@Override
public void addStudent(Student student) {   
	dao.beginTransaction();   
	dao.addStudent(student);   
	dao.commitTransaction();  }   
@Override  
public void updateStudent(Student student) {   
	dao.beginTransaction();   
	dao.updateStudent(student);   
	dao.commitTransaction();  
	}   
@Override  
public void removeStudent(Student student) {   
	dao.beginTransaction();  
	dao.removeStudent(student);  
	dao.commitTransaction();  
	}  
@Override  
public Student findStudentById(int id) {   
	//no need of transaction, as it's an read operation   
	Student student  = dao.getStudentById(id);   
	return student;  
	} 
} 

 