package Questoes;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest2 {
	
	public static void main(String args[]) {
		// Declara��o de vari�veis
		Scanner sc = new Scanner(System.in);
		String senha;
	
		// Mensagem 
		System.out.println("Escreva sua senha forte: ");
		senha = sc.next();
		
		System.out.println(senhaEValida(senha));
		
	}
	
	// M�todo para aplicar regex em cada cen�rio
	public static boolean aplicarRegex(String senha, String regex) {
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        return matcher.matches();
	}
	
	// M�todos para saber se possui um dos crit�rios
	public static boolean possuiNumero(String senha) {
		String regex = "^(?=.*\\d).{1,100}$";
        return aplicarRegex(senha, regex);
	}
	
	public static boolean possuiLetraMin(String senha) {
		String regex = "(?=.*[a-z]).{1,100}$";
        return aplicarRegex(senha, regex);
	}
	
	public static boolean possuiLetraMai(String senha) {
		String regex = "(?=.*[A-Z]).{1,100}$";
        return aplicarRegex(senha, regex);
	}
	
	public static boolean possuiCaracEsp(String senha) {
		String regex = "(?=.*[!@#$%^&*()-+]).{1,100}$";
        return aplicarRegex(senha, regex);
	}
	
	// M�todo para saber se a senha � v�lida. Retorna uma String em forma de mensagem
	public static String senhaEValida(String senha) {
		// Cada vez que um crit�rio n�o for satisfeito, o count ser� incrementado
		int count = 0;
		if(!possuiNumero(senha))
			count++;
		if(!possuiLetraMin(senha))
			count++;
		if(!possuiLetraMai(senha))
			count++;
		if(!possuiCaracEsp(senha))
			count++;
		
		//Primeiro if para saber se a senha satisfaz os crit�rios 
		if(possuiNumero(senha) && possuiLetraMin(senha) && possuiLetraMai(senha) && possuiCaracEsp(senha)) {
			if(senha.length() >= 6)//Se a senha for maior ou igual a 6, ent�o ela j� satisfez tudo
				return "Senha forte";
			else // Se a senha tiver os crit�rios, menos a quantidade m�nima de caracteres, retorne essa mensagem
				return "Faltam " + (6 - senha.length()) + " caracteres";
		} 
		
		// Caso um dos crit�rios acima n�o for satisfeito
		if(senha.length() >= 6 || count >= (6 - senha.length())) {// Se a quantidade min de carac j� foi satisfeita ou os campos obrigat�rios forem maior que o que falta pra completar a quantidade m�nima
			return "Faltam " + count + " caracteres";
		}
		else  { // Sen�o, apenas print a quantidade de caracteres que falta para o min
			return "Faltam " + (6 - senha.length()) + " caracteres";
		}
	}
	
}
