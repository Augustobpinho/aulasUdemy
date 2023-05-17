package Fundamentos.Operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 8.0;
	
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "recuperação";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);

		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7; //operadores relacionais
		boolean temDesconto = bomComportamento && passouPorMedia;//operadores lógicos
		String resultado = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado);
	
	
	}
}
