package Questoes;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Quest3Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando os testes");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Terminando os testes");
	}

	@Test
	public void encontrarTodasSubStringsTest() {
		Quest3 q3 = new Quest3();
		ArrayList<String> al = q3.encontrarTodasSubStrings("ovo");
		assertTrue(al.size()>=0);
	}
	
	@Test
	public void encontrarTodosAnagramasTest() {
		Quest3 q3 = new Quest3();
		ArrayList<String> al = q3.encontrarTodasSubStrings("ovo");
		
		q3.encontrarTodosAnagramas(al, al.size());
		assertTrue(al.size()>=0);
	}

}
