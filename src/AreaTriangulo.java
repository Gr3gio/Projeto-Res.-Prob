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

public class AreaTriangulo extends JFrame{
	
	public AreaTriangulo(String Triangulo){
		
		//janela triangulo configurações
		super(Triangulo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(650, 500);	
		getContentPane().setBackground(new Color(178,34,34));
		setLayout(null);
		
		
		JLabel de_principal = new JLabel();
		de_principal.setText("Área do triangulo");
		de_principal.setBounds(new Rectangle(200, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
		//exemplo imagem
		ImageIcon img_triangulo = new ImageIcon("adicionais\\triangulo.png");
		JLabel de_imagem = new JLabel();
		de_imagem.setIcon(new ImageIcon(img_triangulo.getImage().getScaledInstance(200, 125, 5 )));
		de_imagem.setBounds(new Rectangle(125, 50,300,200));
		add(de_imagem);
		
		//imagem da formula
		ImageIcon img_formula = new ImageIcon("adicionais\\areatriangulo.png");
		JLabel de_formula = new JLabel();
		de_formula.setIcon(new ImageIcon(img_formula.getImage().getScaledInstance(150, 75, 5 )));
		de_formula.setBounds(new Rectangle(325, 50,300,200));
		add(de_formula);
		
		
		//explicacao do programa
		JLabel de_explicacao = new JLabel();
		de_explicacao.setText("<html>A partir da base a da altura fornecida, o programa calculará a área do triangulo.</html>");
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
				a = (b*h)/2;
				
				JOptionPane.showMessageDialog(null, "A área do triangulo é: "+a);
				
			}
		});
		add(calcular);
		
	}

}