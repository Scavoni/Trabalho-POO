import java.util.Scanner;

public class Cliente extends Pessoa{
	private int quarto;
	private float conta;
	
	public Cliente(){
		super();
		lerDados();
	}
	
	public boolean setQuarto(int quarto){
		if(quarto>=0){
			if(BaseDeDadosQuarto.adicionar(quarto)){
				this.quarto=quarto;
				return true;
			}
		}
		return false;
	}
	public boolean setConta(float valor){
		if(valor>=0){
			this.conta+=valor;
			return true;
		}
		else return false;
	}
	
	public int getQuarto(){
		return this.quarto;
	}
	public float getConta(){
		return this.conta;
	}
	
	public boolean addServico(int valor){
		return setConta(valor);
	}
	
	
	public void lerDados(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("QUARTO DE ESTADIA: ");
		while(!setQuarto(s.nextInt()));
		
	}
	
	public void mostrarDados(){
		super.mostrarDados();
		
		System.out.println("QUARTO DE ESTADIA: "+getQuarto());
		System.out.println("VALOR DA CONTA: R$ "+getConta());
	}
	
	public String getClasse(){
		return "Cliente";
	}
	
}
