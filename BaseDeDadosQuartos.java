
public class BaseDeDadosQuarto {
	private static int MAX;
	private static int count=0;
	private static int quartos[];
	
	public static void setMAX(int total){
		BaseDeDadosQuarto.MAX=total;
	}
	
	public static void esvaziar(){
		for(int i=0;i<BaseDeDadosQuarto.MAX;i++){
			quartos[i]=0;
		}
	}
	
	public static boolean adicionar(int quarto){
		if(quarto>=0 && quarto<BaseDeDadosQuarto.MAX){
			quartos[quarto]=1;
			return true;
		}
		else return false;
	}
	
	public static void listarOcupados(){
		System.out.println("QUARTOS: ");
		for(int i=0;i<BaseDeDadosQuarto.MAX;i++){
			if(quartos[i]!=0)
				System.out.println(i);
		}
	}
	
	public static boolean pesquisarOcupado(int quarto){
		if(quarto>=0 && quarto<BaseDeDadosQuarto.MAX){
			if(quartos[quarto]==1)
				return true;
			else return false;
		}
		System.out.println("QUARTO NAO EXISTE!");
		return false;
	}
	
	public static boolean sairQuarto(int quarto){
		if(quarto>=0 && quarto<BaseDeDadosQuarto.MAX){
			quartos[quarto]=0;
			return true;
		}
		else return false;
	}
	
	public static boolean adicionarCliente(int quarto){
		if(quarto>=0 && quarto<BaseDeDadosQuarto.MAX){
			if(quartos[quarto]!=1){
				quartos[quarto]=1;
				count++;
				return true;
			}
			System.out.println("QUARTO OCUPADO!");
			return false;
		}
		System.out.println("QUARTO NAO EXISTE!");
		return false;
	}
	
	
}
