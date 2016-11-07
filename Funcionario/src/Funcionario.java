abstract class Funcionario {
	public String nome;
	public String departamento;
	protected double salario = 0;
	// public Data dataEntrada;
	// private String rg;
	private static int proximoFuncionario = 0;
    private int identificador;
	// 1= funcionario, 2 - gerente, 3= ...
	int cargo;
	
	public int getIdentificador(){
		return this.identificador;
	}
	
	public abstract double getBonus();
	
	double getGanhoAnual(){
		return this.salario * 12;
	}
	
	public double getSalario() {
        return this.salario;
    }
	
	public void setSalario(double valor){
		this.salario = valor;
	}
	
	public Funcionario() {}

	public Funcionario(String nome) {
		this.nome = nome;
		this.identificador =  ++proximoFuncionario;
	}
			
	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("salario atual:" + this.salario);
        System.out.println("ganho anual:" + this.getGanhoAnual());
		// imprimir aqui os outros atributos...
		// também pode imprimir this.calculaGanhoAnual()
	}
	
}

class Gerente extends Funcionario implements Autenticavel {
	
	public double getBonus(){
		return this.salario * 0.3;
	}
	@Override
	public boolean login(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

class Diretor extends Funcionario implements Autenticavel {
	
	public double getBonus(){
		return this.salario * 0.3;
	}

	@Override
	public boolean login(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}

class Desenvolvedor extends Funcionario {
	
	public double getBonus(){
		return this.salario * 0.25;
	}
	
	
}

class TotalizadordeBonus {
	private double total =0;
	
	public void adiciona(Funcionario f){
		total += f.getBonus();
	}
	
	public double getTotal(){
		return this.total;
	}
	
}

// class Data {
	
	// int dia;
	// int mes;
	// int ano;
	// String data;
	
	// public Data () {
		// data = this.dia + "/" + this.mes + "/" + this.ano;
		// SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // try {
				// sdf.setLenient(false);//valida data
				// return  sdf.parse(data);
			// } catch (ParseException ex) {
				// System.out.println("Data Invalida!");
			// }
	// }
	
// }

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] funcionarios;
	int livre = 0;
	
	void adicionarFuncionario(Funcionario f){
		this.funcionarios[this.livre] = f;
        this.livre++;
	}
	
	public Funcionario getFuncionario(int pos){
		return this.funcionarios[pos];
	}
	
	void mostraEmpregados(){
		for (Funcionario x : this.funcionarios){
			if (x != null){
				x.mostra();
			}
		}
	}
	  
	//teste anotado no forum!!
	 boolean contem(Funcionario f){
		boolean teste = false;
		for (Funcionario x : this.funcionarios){
			if (x != null){
				if( x.nome.equals(f.nome)){
					if (x.nome == f.nome) {
						teste = true;
					}
				}
			}
		}
		
		System.out.println(teste);
		if (teste == true){
			return true;
		}else {
			return false;
		}
		
	 }
	 
//	boolean contem(Funcionario f) {
//		for (int i = 0; i < this.livre; i++) {
//			if (f == this.funcionarios[i]) {
//				return true;
//			}
//		}
//		return false;
//	}
	
}

