import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		de_principal.setBounds(new Rectangle(250, 10,500,50));
		de_principal.setFont(new Font("Sans Serif", Font.ITALIC, 20));
		add(de_principal);
		
		
	}

}