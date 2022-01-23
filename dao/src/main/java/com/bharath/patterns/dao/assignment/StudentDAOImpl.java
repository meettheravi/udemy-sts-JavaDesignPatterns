package com.bharath.patterns.dao.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void create(Student student) {
		String sql = "insert into student values (?, ?, ?)";
		jdbcTemplate.update(sql, student.getId(), student.getName(), student.getTestScore());
	}

	@Override
	public void delete(Student student) {
		String sql = "delete from student where id=? and name like ?";
		jdbcTemplate.update(sql, student.id, student.name);

	}

}
