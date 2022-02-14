package Questoes;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Quest2Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando os testes de Quest2");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando os testes de Quest2");
	}

	@Test
	public void senhaEValidaTest() {
		Quest2 q2 = new Quest2();
		String senhaInv = q2.senhaEValida("aaaa");
		assertEquals("Faltam 3 caracteres", senhaInv);
		
		String senhaInvSemMin = q2.senhaEValida("A@3");
		assertEquals("Faltam 3 caracteres", senhaInvSemMin);
		
		String senhaVal = q2.senhaEValida("A3er@34343");
		assertEquals("Senha forte", senhaVal);
		
		String senhaValMenorQue6c = q2.senhaEValida("A3e@");
		assertEquals("Faltam 2 caracteres", senhaValMenorQue6c);
	}

}
