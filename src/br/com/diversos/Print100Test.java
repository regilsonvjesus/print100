package br.com.diversos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Print100Test {

	private Print100 p;
	
	@Before
	public void setUp() throws Exception {
		p = new Print100();
	}

	@Test
	public void test() {
		p.print(50);
		assertTrue(true);
	}

}
