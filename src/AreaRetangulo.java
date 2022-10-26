import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AreaRetangulo extends JFrame{
	
	public AreaRetangulo(String Retangulo){
		
		//janela retangulo configurações
		super(Retangulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		
		JLabel de_principal = new JLabel();
		de_principal.setText("Área do retangulo");
		de_principal.setBounds(new Rectangle(200, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
		//exemplo imagem
		ImageIcon img_retangulo = new ImageIcon("adicionais\\retangulo.png");
		JLabel de_imagem = new JLabel();
		de_imagem.setIcon(new ImageIcon(img_retangulo.getImage().getScaledInstance(200, 125, 5 )));
		de_imagem.setBounds(new Rectangle(125, 50,300,200));
		add(de_imagem);
		
		//texto da formula
		JLabel de_formula = new JLabel();
		de_formula.setText("A = b x h");
		de_formula.setBounds(new Rectangle(365, 50,300,200));
		de_formula.setFont(new Font("Sans Serif", Font.PLAIN, 25));
		add(de_formula);
		
		
		//explicacao do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("<html>A partir da base a da altura fornecida, o programa calculará a área do retangulo.</html>");
		de_explicacao.setBounds(new Rectangle(25, 200,1000,100));
		de_explicacao.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_explicacao);
		
		//texto e caixa da base
		JLabel de_b = new JLabel();
		de_b.setText("Base 'b':");
		de_b.setBounds(new Rectangle(150,275,200,50));
		de_b.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_b);
		JTextField valor_b = new JTextField(2);
		valor_b.setBounds(new Rectangle(160,325, 20,20));
		add(valor_b);
		
		//texto e caixa da altura
		JLabel de_h = new JLabel();
		de_h.setText("Altura 'h':");
		de_h.setBounds(new Rectangle(250,275,200,50));
		de_h.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_h);
		JTextField valor_h = new JTextField(2);
		valor_h.setBounds(new Rectangle(265,325, 20,20));
		add(valor_h);
						
								
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(375,325, 100,20);
		calcular.setBackground(Color.LIGHT_GRAY);
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_b,texto_h;
				double b,h,a;
				
				
				
				texto_b = valor_b.getText();
				texto_h = valor_h.getText();
				
				b = Double.parseDouble(texto_b);
				h = Double.parseDouble(texto_h);
				
				//calcula área
				a = (b*h);
				
				JOptionPane.showMessageDialog(null, "A área do retangulo é: "+a);
				
			}
		});
		add(calcular);
		
		
		
		JButton voltar = new JButton("Voltar");
		voltar.setBounds(250,400, 75,20);
		voltar.setBackground(Color.LIGHT_GRAY);
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaPrincipal telaPrincipal = new TelaPrincipal("Tela inicial");
				telaPrincipal.setVisible(true);
				
			}
		});		
		
		add(voltar);
		
	}

}