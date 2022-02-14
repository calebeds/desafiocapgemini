package Questoes;
import java.util.Scanner;

public class Quest1 {
	public static void main(String args[]) {
		
		int tam = digitarValor();
		
		System.out.println(desenharTriang(tam));
		
	}
	
	static int digitarValor() {
		
		int tam = 0;
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// Mensagem 
		System.out.print("Digite o tamanho n da base e altura do tri�ngulo: ");
				
	    // Try/catch Block
		try{
			tam = Integer.parseInt(sc.next());
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Digite um n�mero v�lido.");
		}
		
		sc.close();
		
		return tam;
	}
	
	static String desenharTriang(int tam) {
		// Quantidade de espa�os
		int esp = tam - 1;
		
		String triang = "";
		
		// Loop para formar a figura Geom�trica
		for(int i = 1; i <= tam; i++) {
			triang += retornarEspaco(esp);
			for(int j = 1; j<=i; j++) {
				triang += "*";
			}
			triang += "\n";
			esp--;
		}
		
		return triang;
	}
	
	public static String retornarEspaco(int n) {
		String espacos = "";
		// Loop para retornar a quantidade de espa�os
		for(int i = 0; i < n; i++)
			espacos += " ";
		
		return espacos;
	}
	
	
}
