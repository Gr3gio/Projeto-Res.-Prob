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

public class TeoremaTales extends JFrame{
	
	public TeoremaTales(String tales){
		
		//janela tales configurações
		super(tales);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		
		JLabel de_principal = new JLabel();
		de_principal.setText("Teorema de Tales");
		de_principal.setBounds(new Rectangle(250, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		//exemplo imagem
		ImageIcon img_tales = new ImageIcon("adicionais\\exemploteoremadetales.png");
		JLabel de_imagem = new JLabel();
		de_imagem.setIcon(new ImageIcon(img_tales.getImage().getScaledInstance(300, 200, 5 )));
		de_imagem.setBounds(new Rectangle(100, 40,300,200));
		add(de_imagem);
		
		//formula imagem
		ImageIcon img_tales2 = new ImageIcon("adicionais\\tales2.png");
		JLabel de_formula = new JLabel();
		de_formula.setIcon(new ImageIcon(img_tales2.getImage().getScaledInstance(100, 75, 5 )));
		de_formula.setBounds(new Rectangle(400, 40,300,200));
		add(de_formula);
		
		
		//texto de explicação do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("Dê os valores de 'A', 'D' e 'E'. Com esses dados o programa irá calcular o valor de 'B'");
		de_explicacao.setBounds(new Rectangle(30, 225,900,50));
		de_explicacao.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_explicacao);
		
		
		
		//texto e caixa do valor A
		JLabel de_a = new JLabel();
		de_a.setText("Valor de 'A':");
		de_a.setBounds(new Rectangle(50,275,200,50));
		de_a.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_a);
		JTextField valor_a = new JTextField(2);
		valor_a.setBounds(new Rectangle(75,325, 20,20));
		add(valor_a);
				
				
				
		//texto e caixa do valor D
		JLabel de_d = new JLabel();
		de_d.setText("Valor de 'D':");
		de_d.setBounds(new Rectangle(200,275,200,50));
		de_d.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_d);
		JTextField valor_d = new JTextField(2);
		valor_d.setBounds(new Rectangle(225,325, 20,20));
		add(valor_d);
				
				
				
		//texto e caixa do valor E
		JLabel de_e = new JLabel();
		de_e.setText("Valor de 'E':");
		de_e.setBounds(new Rectangle(350,275,200,50));
		de_e.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_e);
		JTextField valor_e = new JTextField(2);
		valor_e.setBounds(new Rectangle(375,325, 20,20));
		add(valor_e);
				
				
				
		JButton calcular = new JButton("Calcular 'B'");
		calcular.setBounds(500,325, 100,20);
		calcular.setBackground(Color.LIGHT_GRAY);
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_a, texto_d, texto_e;
				int int_a,int_d,int_e,int_b;
				 
				//pega os textos digitados
				texto_a = valor_a.getText();
				texto_d = valor_d.getText();
				texto_e = valor_e.getText();
				
				//converte para inteiro os textos digitados
				int_a = Integer.parseInt(texto_a);
				int_d = Integer.parseInt(texto_d);
				int_e = Integer.parseInt(texto_e);
				
				//calcula o B
				int_b = (int_e * int_a) / int_d;
				
				
				//mostra como calculou
				//JLabel de_calculo = new JLabel();
				//de_calculo.setText("B = ("+int_e+" x "+int_a+") / "+int_d);
				//de_calculo.setBounds(new Rectangle(175, 350,200,50));
				//de_calculo.setFont(new Font("Sans Serif", Font.PLAIN, 15));
				//add(de_calculo);
											
				//mostra o resultado
				//JLabel de_resultado = new JLabel();
				//de_resultado.setText("Valor de 'B' = "+int_b);
				//de_resultado.setBounds(new Rectangle(300, 350,200,50));
				//de_resultado.setFont(new Font("Sans Serif", Font.PLAIN, 15));
				//add(de_resultado);
				
				
				//troquei dois JLabels por uma caixa de diálogo (poupa do usuário fechar o programa para repetir a ação)
				JOptionPane.showMessageDialog(null, "B = ("+int_e+" x "+int_a+") / "+int_d+"\n Valor de 'B' = "+int_b);
				
			}
		});
		add(calcular);
		
		
		
	}

}