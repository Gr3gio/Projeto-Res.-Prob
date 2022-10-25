import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormulaBhaskara extends JFrame{
	
	public FormulaBhaskara(String bhaskara){
		super(bhaskara);
	    
		
		//janela bhaskara configurações
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		//titulo
		JLabel de_principal = new JLabel();
		de_principal.setText("Formula de Bhaskara");
		de_principal.setBounds(new Rectangle(250, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
		
		//formula escrita
		JLabel de_formula = new JLabel();
		de_formula.setText("x = – b ± √∆2a");
		de_formula.setBounds(new Rectangle(275, 50,500,50));
		de_formula.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		add(de_formula);
		
		
		
		//delta escrito
		JLabel de_delta = new JLabel();
		de_delta.setText("Δ = b2 – 4ac");
		de_delta.setBounds(new Rectangle(275, 75,500,50));
		de_delta.setFont(new Font("Sans Serif", Font.PLAIN, 20));
		add(de_delta);
		
		
		
		//explicacao do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("<html>A partir dos números 'a', 'b', e 'c' digitados, o programa os aplicará nas fórmulas acima,<br> calculando primeiro o delta depois os valores de X.</html>");
		de_explicacao.setBounds(new Rectangle(25, 100,1000,100));
		de_explicacao.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_explicacao);
		
		
		
		//texto e caixa do valor A
		JLabel de_a = new JLabel();
		de_a.setText("Valor de 'a':");
		de_a.setBounds(new Rectangle(50,200,200,50));
		de_a.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_a);
		JTextField valor_a = new JTextField(2);
		valor_a.setBounds(new Rectangle(75,250, 20,20));
		add(valor_a);
		
		
		
		//texto e caixa do valor B
		JLabel de_b = new JLabel();
		de_b.setText("Valor de 'b':");
		de_b.setBounds(new Rectangle(200,200,200,50));
		de_b.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_b);
		JTextField valor_b = new JTextField(2);
		valor_b.setBounds(new Rectangle(225,250, 20,20));
		add(valor_b);
		
		
		
		//texto e caixa do valor C
		JLabel de_c = new JLabel();
		de_c.setText("Valor de 'c':");
		de_c.setBounds(new Rectangle(350,200,200,50));
		de_c.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		add(de_c);
		JTextField valor_c = new JTextField(2);
		valor_c.setBounds(new Rectangle(375,250, 20,20));
		add(valor_c);
		
		
		
		JButton calcular = new JButton("Calcular");
		calcular.setBounds(500,250, 100,20);
		calcular.setBackground(Color.LIGHT_GRAY);
		//calcular.
		calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto_a, texto_b, texto_c;
				int a,b,c;
				double delta, x1,x2;
				
				texto_a = valor_a.getText();
				texto_b = valor_b.getText();
				texto_c = valor_c.getText();
				
				a = Integer.parseInt(texto_a);
				b = Integer.parseInt(texto_b);
				c = Integer.parseInt(texto_c);
				
				
				//calcula delta
				delta = (b * b) + (-4 * (a * c));
				
				//calcula x1 e x2
		        x1 = ((-1 * b) + Math.sqrt(delta))/(2*a);;
		        x2 = ((-1 * b) - Math.sqrt(delta))/(2*a);;

				
		        if (delta >= 0) {
		        	
		        	//mostra delta
		    		JLabel vl_delta = new JLabel();
		    		vl_delta.setText("Valor de delta = "+delta);
		    		vl_delta.setBounds(new Rectangle(200, 300,200,50));
		    		vl_delta.setFont(new Font("Sans Serif", Font.PLAIN, 15));

		    		
			        //mostra valor x1
		    		JLabel de_x1 = new JLabel();
		    		de_x1.setText("Valor de X1 = "+x1);
		    		de_x1.setBounds(new Rectangle(200, 350,200,50));
		    		de_x1.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		    		
		    		
		    		
			        
		    		//mostra valor x2
		    		JLabel de_x2 = new JLabel();
		    		de_x2.setText("Valor de X2 = "+x2);
		    		de_x2.setBounds(new Rectangle(200, 400,200,50));
		    		de_x2.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		    		
		    		//troquei JLabels por uma caixa de diálogo (poupa do usuário fechar o programa para repetir a ação)
		    		JOptionPane.showMessageDialog(null, "Valor de delta = " + delta + "\nValor de X1 = "+x1+"\nValor de X2 = "+x2);
		    		
			        
		        } else {
		        	
		        	
		    		//delta nao possui raiz
		    		//JLabel de_delta = new JLabel();
		    		//de_delta.setText("Delta não possui raiz!");
		    		//de_delta.setBounds(new Rectangle(200, 300,200,50));
		    		//de_delta.setFont(new Font("Sans Serif", Font.PLAIN, 15));
		    		
		        	//troquei JLabels por uma caixa de diálogo (poupa do usuário fechar o programa para repetir a ação)
		    		JOptionPane.showMessageDialog(null, "Delta não possui raiz!");
		    		
		        }
		        
				
			}
		});		
		add(calcular);
		
		
		
		
	}
		

}
