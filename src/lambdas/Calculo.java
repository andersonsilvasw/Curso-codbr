package lambdas;

@FunctionalInterface // Essa annotation obriga que a interface tenha apenas um m�todo abstrato.
public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}

}
