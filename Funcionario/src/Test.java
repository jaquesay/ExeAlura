class TestEmpresa {
	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		e1.funcionarios = new Funcionario[10];
		
		for (int i = 0; i < 5; i++) {
			Funcionario f = new Desenvolvedor();
			f.setSalario(1000 + i * 100);
			f.nome = "nome" + i;
			e1.adicionarFuncionario(f);
		}
		
		e1.mostraEmpregados();
		
		Gerente f1 = new Gerente();

        f1.nome = "nome1";
        f1.setSalario(100);
        f1.setSalario(50);
		
		if (e1.contem(f1) == true ){
			System.out.println("Achei!");
		} else {
			System.out.println("Não Achei!");
		}
	}
}
class TestaFuncionario {

    public static void main(String[] args) {
    	Desenvolvedor f1 = new Desenvolvedor();

        f1.nome = "Hugo";
        f1.setSalario(100);
	
		Gerente f2 = new Gerente();        
        f2.nome = "Danilo";
        f2.setSalario(200);
		
		System.out.println(f1.getBonus());
		System.out.println(f2.getBonus());
		
		TotalizadordeBonus totalizador = new TotalizadordeBonus();
		totalizador.adiciona(f1);
		totalizador.adiciona(f2);
		
		System.out.println(totalizador.getTotal());
		
		
        // if (f1 == f2) {
            // System.out.println("iguais");
        // } else {
            // System.out.println("diferentes");        
        // }
		
		f1.mostra();

        
    }
}