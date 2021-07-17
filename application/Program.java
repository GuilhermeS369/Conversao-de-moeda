package application;

import java.util.Scanner;

import util.CurrecyConverter;

public class Program {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("What is the dollar price?");
		CurrecyConverter.dollar = sc.nextDouble();
		//RECEBE O VALOR DO DOLAR
		System.out.println("HOw many dollars will be bought?");
		double value = sc.nextDouble();
		//RECEBE O VALOR A SER CONVERTIDO
		double resultado = CurrecyConverter.conversao(value);
		// FAZ A VARIAVEL RESULTADO JÁ RECEBER O CALCULO, DIZENDO Q O CALCULO E FEITO SOBRE A VARIAVEL VALUE
		System.out.printf("Amount to be paid in reais = %.2f", resultado);
		sc.close();	
		
		
		
	}

}
 