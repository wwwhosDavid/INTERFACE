package sistema_funcionarios;

public class Main {
	public static void main(String [] args) {
		
		
		// Exibir código, teste
		Funcionario funcionario1 = new FuncionarioAssalariado(4000); 
        Funcionario funcionario2 = new FuncionarioHorista(5800);

        System.out.println("Bônus do Funcionario Assalariado: R$ " + funcionario1.calcularbonus());
        System.out.println("Bônus do Funcionario Horista: R$ " + funcionario2.calcularbonus());
	}
	
}
