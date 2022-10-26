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

public class TeoremaPitagoras extends JFrame{
	
	public TeoremaPitagoras(String Pitagoras){
		
		//janela pitagoras configurações
		super(Pitagoras);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		
		JLabel de_principal = new JLabel();
		de_principal.setText("Teorema de Pitagoras");
		de_principal.setBounds(new Rectangle(200, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
		//exemplo imagem
		ImageIcon img_pitagoras = new ImageIcon("adicionais\\teorema de pitagoras.png");
		JLabel de_imagem = new JLabel();
		de_imagem.setIcon(new ImageIcon(img_pitagoras.getImage().getScaledInstance(350, 250, 5 )));
		de_imagem.setBounds(new Rectangle(150, 60,300,200));
		add(de_imagem);
		
		//explicacao do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("<html>A partir dos números 'a' e 'b' digitados, o programa os aplicará na fórmula acima,<br> calculando o valor de 'c'. 'a' e 'b' são os catetos, e 'c' a hipotenusa.</html>");
		de_explicacao.setBounds(new Rectangle(25, 250,1000,100));
		de_explicacao.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_explicacao);
		
		//texto e caixa do valor a
		JLabel de_a = new JLabel();
		de_a.setText("Valor de 'a':");
		de_a.setBounds(new Rectangle(100,325,200,50));
		de_a.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_a);
		JTextField valor_a = new JTextField(2);
		valor_a.setBounds(new Rectangle(125,375, 20,20));
		add(valor_a);
						
						
						
		//texto e caixa do valor b
		JLabel de_b = new JLabel();
		de_b.setText("Valor de 'b':");
		de_b.setBounds(new Rectangle(300,325,200,50));
		de_b.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_b);
		JTextField valor_b = new JTextField(2);
		valor_b.setBounds(new Rectangle(325,375, 20,20));
		add(valor_b);		
		
		JButton calcular = new JButton("Calcular 'c'");
		calcular.setBounds(450,375, 100,20);
		calcular.setBackground(Color.LIGHT_GRAY);
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_a, texto_b;
				int a,b,c2;
				double c;
				
				
				texto_a = valor_a.getText();
				texto_b = valor_b.getText();
				
				
				a = Integer.parseInt(texto_a);
				b = Integer.parseInt(texto_b);
				
				//calcula c
				c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); 
				
				JOptionPane.showMessageDialog(null, "c² = "+a+"² + "+b+"²\n c = "+c);
				
			}
		});
		add(calcular);
		
		
		JButton voltar = new JButton("Voltar");
		voltar.setBounds(250,425, 75,20);
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