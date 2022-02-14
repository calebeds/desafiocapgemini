package Questoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quest3 {
	static final int NO_OF_CHARS = 256;
	
	public static void main(String args[]) {
		
		//Scanner para receber os inputs
		Scanner sc = new Scanner(System.in);
		
		// Mensagem para o usuário digitar na tela
		System.out.println("Escreva a string a ser avalidada: ");
		String str = sc.next();
		
		// Popula o ArrayList com todas as substrings possíveis da string digitada
		ArrayList<String> arrL = encontrarTodasSubStrings(str);
		
		// Encontrar todos os anagramas se houver
		encontrarTodosAnagramas(arrL, arrL.size());
		
	}
	
	// Método para encontrar as Substrings, retorna um ArrayList
	static ArrayList<String> encontrarTodasSubStrings(String str) {
		ArrayList<String> subStrings = new ArrayList<String>();
		
		// Duplo loop para adicionar todas as substring no ArrayList declarado acima.
		for (int i = 0; i < str.length(); i++) 
			   for (int j = i+1; j <= str.length(); j++) 
			         subStrings.add(str.substring(i,j));
		
		return subStrings;
	}
	
	static void encontrarTodosAnagramas(ArrayList<String> arrL, int n) {
		int count = 0;// Count para saber quantos pares de anagramas existem
		
		// Duplo loop para saber se existem anagramas entre as substrings
		for(int i = 0; i < n; i++)
			for(int j = i+1; j < n; j++)
				if(saoAnagramas(arrL.get(i), arrL.get(j))) {
					System.out.println(arrL.get(i) + " é anagrama de " + arrL.get(j));
					count++;
				}
		// Mensagens para cada caso
		if(count >=1)
			System.out.println("Existem " + count + " pares de anagramas");
		else if(count == 1)
			System.out.println("Existe um anagrama");
		else
			System.out.println("Não existe anagramas.");
					
	}
	
	// Função verifica se duas strings são anagramas uma da outra
	static boolean saoAnagramas(String str1, String str2) {
		// Cria um array de ints
		int[] count = new int[NO_OF_CHARS];
		int i;
		
		//Para cada um dos caracteres das strings, incremente ou decremente no array de ints
		for(i = 0; i< str1.length() && i < str2.length(); i++) {
			count[str1.charAt(i)]++;
			count[str2.charAt(i)]--;
		}
		
		// Se as Strings são de tamanhos iguais
		if(str1.length() != str2.length())
			return false;
		
		//Não há um valor negativo no array de ints
		for(i = 0; i < NO_OF_CHARS; i++)
			if(count[i] != 0)
				return false;
		
		return true;
	}
		
	
	

	
	
}
