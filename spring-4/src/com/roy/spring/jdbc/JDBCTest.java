package com.roy.spring.jdbc;

import static org.hamcrest.CoreMatchers.nullValue;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.aspectj.weaver.AjAttribute.PrivilegedAttribute;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

class JDBCTest {

	private ApplicationContext ctx = null;
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	{
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		namedParameterJdbcTemplate = (NamedParameterJdbcTemplate) ctx.getBean("namedParameterJdbcTemplate");
	}
	
	@Test
	public void testNamedParameterJdbcTemplate() {
		String sql = "insert into employee(last_name, email, dept_id) values(:ln, :email,:did)";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("ln", "test");
		paramMap.put("email", "12312@123.com");
		paramMap.put("did", 1);
		namedParameterJdbcTemplate.update(sql, paramMap);
	}
	
	@Test
	public void testNamedParameterJdbcTemplate2() {
		String sql = "insert into employee(last_name, email, dept_id) values(:lastname, :email,:deptId)";
		Employee employee = new Employee();
		employee.setEmail("111@111");
		employee.setLastname("222");
		employee.setDeptId(2);
		
		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(employee);
		
		namedParameterJdbcTemplate.update(sql, paramSource);
	}
	
	/*
	 * 获取一条记录，获得对象
	 * 
	 * */
	@Test
	public void testQueryForObject() {
		String sql = "select id, last_name lastname, email, dept_id from employee where id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper,1);
		System.out.println(employee);
	}
	
	@Test
	public void testQueryForList() {
		String sql = "select id, last_name lastname, email, dept_id from employee";

		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		List<Employee> employees = jdbcTemplate.query(sql, rowMapper);		
		System.out.println(employees);
	}
	
	@Test
	public void testQueryForObject2() {
		String sql = "select count(id) from employee";
		
		long count = jdbcTemplate.queryForObject(sql, long.class);
		System.out.println(count);
	}
	
	/*
	 * 更新单条数据
	 * */
	@Test
	public void testUpdate() {
		String sql = "update data set name=? where id=?";
		jdbcTemplate.update(sql, "jack", 1);
	}
	
	/*
	 * 批量更新
	 * */
	@Test
	public void testBatchUpdate() {
		String sql = "insert into data(ID, name, Description) values(?,?,?)";
		
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[] {2,"AA","AA"});
		batchArgs.add(new Object[] {3,"BB","BB"});
		batchArgs.add(new Object[] {4,"CC","CC"});
		jdbcTemplate.batchUpdate(sql, batchArgs);
	}
	
	@Test
	public void test() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}

}
