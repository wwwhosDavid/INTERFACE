package sistema_funcionarios;

//Classe funcionario assalariado
	class FuncionarioAssalariado implements Funcionario {
    	
	    private double salario;
	    
	    public FuncionarioAssalariado(double salario) {
	    	this.salario = salario;
	    	
	    }
	    
	    
	    public double calcularbonus() {
	    return 5000.00; 
	    	
	    }
	}
