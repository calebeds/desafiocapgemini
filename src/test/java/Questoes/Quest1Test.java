package Questoes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Quest1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando os testes de Quest1");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando os testes de Quest1");
	}

	@Test
	public void retornarEspacoTest() {
		Quest1 q1 = new Quest1();
		String esp = q1.retornarEspaco(4);
		assertEquals(4, esp.length());
	}
	
	/*@Test
	public void digitarValorTest() {
		Quest1 q1 = new Quest1();
		int n = q1.digitarValor();
		assertTrue(n>=0);
	}*/
	
	@Test
	public void desenharTriangTest() {
		Quest1 q1 = new Quest1();
		String triang = q1.desenharTriang(6);
		assertEquals(42, triang.length());
	}
	
	

}
