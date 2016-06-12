import java.util.Scanner;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String contato;
	
	public Pessoa(){
		this.lerDados();
	}
	
	public boolean setNome(String nome){
		if(nome.length()>0){
			this.nome=nome;
			return true;
		}
		else return false;
	}
	public boolean setCPF(String cpf){
		if(cpf.length()>0){
			this.cpf=cpf;
			return true;
		}
		else return false;
	}
	public boolean setContato(String contato){
		if(contato.length()>0){
			this.contato=contato;
			return true;
		}
		else return false;
	}
	
	public String getNome(){
		return this.nome;
	}
	public String getCPF(){
		return this.cpf;
	}
	public String getContato(){
		return this.contato;
	}
	
	public void lerDados(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("NOME: ");
		while(!setNome(s.nextLine()));
		
		System.out.println("CPF: ");
		while(!setCPF(s.nextLine()));
		
		System.out.println("CONTATO: ");
		while(!setContato(s.nextLine()));
	}
	
	public void mostrarDados(){
		System.out.println("NOME: "+getNome());
		System.out.println("CPF: "+getCPF());
		System.out.println("CONTATO: "+getContato());
	}
	
	public abstract String getClasse();
	
}
