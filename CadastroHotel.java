import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CadastroHotel extends JInternalFrame{
	private JFrame janela = new JFrame("Cadastro");
	private JPanel painel = new JPanel(new GridLayout(5, 2));
	
	private JTextField jtNome = new JTextField(10);
	private JTextField jtTelefone = new JTextField(10);
	private JTextField jtNumQuartos = new JTextField(10);
	private JTextField jtPrecoEstadia = new JTextField(10);
	
	private JLabel jlNome = new JLabel("Nome hotel: ");
	private JLabel jlTelefone = new JLabel("Telefone: ");
	private JLabel jlNumQuartos = new JLabel("Numero de quartos: ");
	private JLabel jlPrecoEstadia = new JLabel("Preco estadia: ");
	
	private JButton jbEnviar = new JButton("Enviar");
	
	public CadastroHotel(){
		
		
		painel.add(jlNome);
		painel.add(jtNome);
		
		painel.add(jlTelefone);
		painel.add(jtTelefone);
		
		painel.add(jlNumQuartos);
		painel.add(jtNumQuartos);
		
		painel.add(jlPrecoEstadia);
		painel.add(jtPrecoEstadia);
		
		jbEnviar.setSize(30,20);
		painel.add(jbEnviar);
		
		
		jbEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hotel hotel = new Hotel(jtNome.getText(), jtTelefone.getText(), 
						Integer.parseInt(jtNumQuartos.getText()), 
						Float.parseFloat(jtPrecoEstadia.getText()));
				
				janela.setVisible(false);
			}
		});
		
		janela.getContentPane().add(painel, BorderLayout.CENTER);
		janela.setSize(500, 150);
		janela.setVisible(true);
	}
	
}
