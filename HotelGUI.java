import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class HotelGUI extends JFrame{
	private JFrame janela = new JFrame("Manutencao de hotel");
	private JPanel painel = new JPanel(new BorderLayout());
	private JDesktopPane desktop = new JDesktopPane();
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menu = new JMenu("Opcoes");
	private JMenuItem jmiAbrir, jmiSalvar;
	private JFileChooser jEscolhe = new JFileChooser();
	
	private JButton jbCadastro= new JButton("Cadastrar hotel");
	private JButton jbCliente = new JButton("Clientes");
	private JButton jbFuncionario = new JButton("Funcionarios");
	
	public HotelGUI(){
		setJMenuBar(menuBar);
		
		jmiAbrir = new JMenuItem("Abrir");
		jmiAbrir.setMnemonic('A');
		
		jmiSalvar = new JMenuItem("Salvar");
		jmiSalvar.setMnemonic('S');
		
		jEscolhe.setCurrentDirectory(new File("."));
		
		menu.add(jmiAbrir);
		menu.add(jmiSalvar);
		
		menuBar.add(menu);
		
		jbCliente.setEnabled(false);
		jbFuncionario.setEnabled(false);
		
		painel.add(jbCliente, BorderLayout.CENTER);
		jbCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		painel.add(jbFuncionario, BorderLayout.SOUTH);
		jbFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		painel.add(jbCadastro,BorderLayout.NORTH);
		jbCadastro.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CadastroHotel jifCadastro = new CadastroHotel();
				
				jbCliente.setEnabled(true);
				jbFuncionario.setEnabled(true);
				jbCadastro.setEnabled(false);
				
				jifCadastro.setSize(350,200);
				jifCadastro.setVisible(true);
			}
		});
		desktop.setSize(350,200);
		desktop.setVisible(false);
		
		janela.getContentPane().add(desktop);
		janela.getContentPane().add(painel);
		janela.setJMenuBar(menuBar);
		
		janela.setBackground(Color.GRAY);
		janela.setSize(500, 140);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
