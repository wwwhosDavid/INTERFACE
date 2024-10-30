package sistema_funcionarios;

//Classe funcionário horista
class FuncionarioHorista implements Funcionario {
	
	private double totalAnualRecebido;
	
	public FuncionarioHorista (double totalAnualRecebido) {
		this.totalAnualRecebido = totalAnualRecebido;
		
	}
	
	public double calcularbonus() {
	return totalAnualRecebido *0.10; //10% do ano recebido	
		
	}
}
