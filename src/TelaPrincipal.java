import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaPrincipal extends JFrame{
	
	
	public TelaPrincipal(String titulo) {
		
		//janela principal configurações
		super(titulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
	
		//texto na tela
		JLabel de_principal = new JLabel();
		de_principal.setText("Tela Principal");
		de_principal.setBounds(new Rectangle(250, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		//texto na tela
		JLabel de_escolha = new JLabel();
		de_escolha.setText("Escolha a operação que deseja realizar");
		de_escolha.setBounds(new Rectangle(175,50,600,50));
		de_escolha.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		add(de_escolha);
	
		
		//botão 
		JButton bhaskara = new JButton("Bhaskara");
		bhaskara.setBounds(50,150, 120,30);
		bhaskara.setBackground(Color.LIGHT_GRAY);
		bhaskara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormulaBhaskara telaBhaskara = new FormulaBhaskara("Bhaskara");
				telaBhaskara.setVisible(true);
			}
		});
		
		add(bhaskara);
		
		
		//botao
		JButton tales = new JButton("Tales");
		tales.setBounds(250,150, 120,30);
		tales.setBackground(Color.LIGHT_GRAY);
		tales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeoremaTales telaTales = new TeoremaTales("Tales");
				telaTales.setVisible(true);
			}
		});		
		
		add(tales);
		
		
		//botao
		JButton pitagoras = new JButton("Pitagoras");
		pitagoras.setBounds(450,150, 120,30);
		pitagoras.setBackground(Color.LIGHT_GRAY);
		pitagoras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TeoremaPitagoras telaPitagoras = new TeoremaPitagoras("Pitagoras");
				telaPitagoras.setVisible(true);
			}
		});		
		
		add(pitagoras);
		
		//texto para separar as equações das áreas
		JLabel de_areas = new JLabel();
		de_areas.setText("Áreas");
		de_areas.setBounds(new Rectangle(275,225,50,50));
		de_areas.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		add(de_areas);
		
		
		//botao
		JButton circulo = new JButton("Circulo");
		circulo.setBounds(50,300, 120,30);
		circulo.setBackground(Color.LIGHT_GRAY);
		circulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreaCirculo telaCirculo = new AreaCirculo("Circulo");
				telaCirculo.setVisible(true);
			}
		});		
		
		add(circulo);
		
		//botao
		JButton triangulo = new JButton("Triangulo");
		triangulo.setBounds(250,300, 120,30);
		triangulo.setBackground(Color.LIGHT_GRAY);
		triangulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AreaTriangulo telaTriangulo = new AreaTriangulo("Triangulo");
				telaTriangulo.setVisible(true);
			}
		});		
		
		add(triangulo);
		
	
	}
}
