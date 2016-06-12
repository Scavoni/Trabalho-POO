import java.util.*;

public class Funcionarios extends Pessoa{
	private String funcao;
	private float salario;
	
	public Funcionarios(){
		super();
		lerDados();
	}
	
	public boolean setFuncao(String funcao){
		if(funcao.length()>0){
			this.funcao=funcao;
			return true;
		}
		else return false;
	}
	public boolean setSalario(float salario){
		if(salario>=0){
			this.salario=salario;
			return true;
		}
		else return false;
	}
	
	public String getFuncao(){
		return this.funcao;
	}
	public float getSalario(){
		return this.salario;
	}
	
	public void lerDados(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("FUNCAO DO FUNCIONARIO: ");
		while(!setFuncao(s.nextLine()));
		
		System.out.println("SALARIO: ");
		while(!setSalario(s.nextFloat()));
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		System.out.println("FUNCAO DO FUNCIONARIO: "+getFuncao());
		System.out.println("SALARIO: "+getSalario());
	}
	
	public String getClasse(){
		return "Funcionarios";
	}
	
}
