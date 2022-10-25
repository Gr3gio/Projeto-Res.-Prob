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

public class AreaCirculo extends JFrame{
	
	public AreaCirculo(String Circulo){
		
		//janela circulo configurações
		super(Circulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		
		JLabel de_principal = new JLabel();
		de_principal.setText("Área do circulo");
		de_principal.setBounds(new Rectangle(200, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
		//exemplo imagem
		ImageIcon img_circulo = new ImageIcon("adicionais\\circulo.png");
		JLabel de_imagem = new JLabel();
		de_imagem.setIcon(new ImageIcon(img_circulo.getImage().getScaledInstance(200, 125, 5 )));
		de_imagem.setBounds(new Rectangle(175, 50,300,200));
		add(de_imagem);
		
		
		//explicacao do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("<html>A partir do raio informado 'r', o programa calculará a área do círculo.<br>Esse programa considera pi = 3,14 </html>");
		de_explicacao.setBounds(new Rectangle(25, 200,1000,100));
		de_explicacao.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_explicacao);
		
		//texto e caixa do raio
		JLabel de_r = new JLabel();
		de_r.setText("Valor de 'r':");
		de_r.setBounds(new Rectangle(175,275,200,50));
		de_r.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_r);
		JTextField valor_r = new JTextField(2);
		valor_r.setBounds(new Rectangle(200,325, 20,20));
		add(valor_r);
						
								
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(350,325, 100,20);
		calcular.setBackground(Color.LIGHT_GRAY);
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_r;
				double r,pi,a;
				
				
				
				texto_r = valor_r.getText();
				
				r = Double.parseDouble(texto_r);
				pi = 3.14;
				
				//calcula área
				a = pi * (Math.pow(2, r));
				
				JOptionPane.showMessageDialog(null, "A área do círculo é: "+a);
				
			}
		});
		add(calcular);
		
	}

}