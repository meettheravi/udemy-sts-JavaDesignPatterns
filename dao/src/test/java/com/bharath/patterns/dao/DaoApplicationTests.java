package com.bharath.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bharath.patterns.dao.assignment.Student;
import com.bharath.patterns.dao.assignment.StudentDAO;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	EmployeeDAO empDao;

	@Autowired
	StudentDAO stuDao;

	@Test
	void testCreateEmployee() {
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("John");

		empDao.create(employee);
	}

	@Test
	void testCreateStudent() {
		Student student = new Student();
		student.setId(123);
		student.setName("Student1");
		student.setTestScore(85);
		
		stuDao.create(student);

		student.setId(456);
		student.setName("Student2");
		student.setTestScore(87);

		stuDao.create(student);
	}

	@Test
	void testDeleteStudent() {
		Student student = new Student();
		student.setId(123);
		student.setName("Student1");

		stuDao.delete(student);
	}

}
