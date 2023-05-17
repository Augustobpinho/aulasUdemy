package Fundamentos.Operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // incrementa mais 1
		a--; // decrementa menos 1
		
		++b; //incrementa mais 1
		--b; //decrementa menos 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio... ");
		System.out.println(++a == b--); //
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
	}

}
