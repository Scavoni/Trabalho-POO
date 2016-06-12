import java.util.*;

public class Hotel {
	private static ArrayList<String> servicos = new ArrayList<String>();
	private static int valores[];
	private static int i;
	private String nomeHotel;
	private String foneHotel;
	private int numeroQuartos;
	private float estadia;
	
	public Hotel(String nome, String fone, int nQuartos, float estadia){
		this.i=0;
		lerDados(nome, fone, nQuartos, estadia);
	}
	
	
	public boolean setNomeHotel(String nome){
		if(nome.length()>0){
			this.nomeHotel=nome;
			return true;
		}
		else return false;
	}
	public boolean setFoneHotel(String fone){
		if(fone.length()>0){
			this.foneHotel=fone;
			return true;
		}
		else return false;
	}
	public boolean setNumQuartos(int quartos){
		if(quartos>0){
			this.numeroQuartos=quartos;
			return true;
		}
		else return false;
	}
	public boolean setEstadia(float valor){
		if(valor>0){
			this.estadia=valor;
			return true;
		}
		else return false;
	}
	
	public String getNomeHotel(){
		return this.nomeHotel;
	}
	public String getFoneHotel(){
		return this.foneHotel;
	}
	public int getNumQuartos(){
		return this.numeroQuartos;
	}
	public float getEstadia(){
		return this.estadia;
	}
	
	
	public void lerDados(String nome, String fone, int nQuartos, float estadia){
		//Scanner s = new Scanner(System.in);
		
		//System.out.println("NOME HOTEL: ");
		while(!setNomeHotel(nome));
		
		//System.out.println("TELEFONE HOTEL: ");
		while(!setFoneHotel(fone));
		
		//System.out.println("NUMEROS DE QUARTO: ");
		while(!setNumQuartos(nQuartos));
		BaseDeDadosQuarto.setMAX(this.getNumQuartos());
		
		//System.out.println("VALOR DA ESTADIA: ");
		while(!setEstadia(estadia));
	}
	
	public void mostrarDados(){
		System.out.println("NOME DO HOTEL: "+getNomeHotel());
		System.out.println("TELEFONE HOTEL: "+getFoneHotel());
		System.out.println("NUMEROS DE QUARTO: "+getNumQuartos());
	}
	
	public static void addServico(){
		Scanner s = new Scanner(System.in);
		
		System.out.println("SERVICO: ");
		servicos.add(s.nextLine());
		
		System.out.println("VALOR: ");
		valores[i++]=s.nextInt();
	}
	
	public void listarServicos(){
		int j=0;
		for(String s: servicos){
			System.out.println(s+" R$: "+valores[j++]);
		}
	}
	
}
