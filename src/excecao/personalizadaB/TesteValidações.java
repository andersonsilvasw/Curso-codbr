package excecao.personalizadaB;

import excecao.Aluno;
import excecao.personalizadaA.NumeroForaIntervaloException;
import excecao.personalizadaA.StringVaziaException;
import excecao.personalizadaA.Validar;

public class TesteValidações {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");	
	}
}
