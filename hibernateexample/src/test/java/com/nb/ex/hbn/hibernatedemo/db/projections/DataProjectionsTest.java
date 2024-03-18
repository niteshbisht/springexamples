package com.nb.ex.hbn.hibernatedemo.db.projections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.jdbc.Sql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Profile("test")
@Sql(scripts = "classpath:testsql/populateDB.sql")
@SpringBootTest
public class DataProjectionsTest {

	@Autowired
	private EntityManager entityManager;
	
	
	@BeforeEach
	public void setUp() {
		log.info("Entity Manager e={}", entityManager);
	}
	
	@Test
	public void fetchData() {
		EntityManagerFactory entityManagerFactory = this.entityManager.getEntityManagerFactory();
//		System.out.println(entityManagerFactory);
		
	}
}
