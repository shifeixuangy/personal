package com.sfx.design.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestSingletonClass
{
	@Test
	public void test()
	{
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		assertEquals(s1, s2);
	}
}
