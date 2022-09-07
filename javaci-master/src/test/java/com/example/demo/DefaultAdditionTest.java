package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.impl.DefaultAdditionImpl;

class DefaultAdditionTest {

	@Test
	void test1() {
		assertEquals(10, new DefaultAdditionImpl().add(5,5));
	}

	@Test
	void test2() {
		assertEquals(20, new DefaultAdditionImpl().add(15,5));
	}
	@Test
	void test3() {
		assertEquals(0, new DefaultAdditionImpl().add(0,0));
	}
	@Test
	void test4() {
		assertEquals(0, new DefaultAdditionImpl().add(0,0));
	}
	
	@Test
	void test5() {
		assertEquals(0, new DefaultAdditionImpl().add(0,0));
	}
	@Test
	void test6() {
		assertEquals(0, new DefaultAdditionImpl().add(0,0));
	}
	@Test
	void test7() {
		assertEquals(0, new DefaultAdditionImpl().add(1,-1));
	}
}
