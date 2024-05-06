package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAñadir;
	private JComboBox<String> cmbVocal, cmbConsonante;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtAñadir = new JTextField();
		txtAñadir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese Palabras");
		
		cmbVocal = new JComboBox();
		
		cmbConsonante = new JComboBox();
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				añadir();
			}
		});
		
		JButton btnVocal = new JButton("Borra Vocal");
		btnVocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarVocal();

			}
		});
		
		JButton btnConsonante = new JButton("Borrar Consonante");
		btnConsonante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrarConsonante();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Frases que empiezan por VOCAL");
		
		JLabel lblNewLabel_1_1 = new JLabel("Frases que empiezan por CONSONANTE");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAñadir, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
								.addComponent(cmbVocal, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(cmbConsonante, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(154)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnIngresar)
								.addComponent(btnVocal)
								.addComponent(btnConsonante))))
					.addContainerGap(195, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAñadir, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnIngresar))
					.addGap(33)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbVocal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnVocal))
					.addGap(34)
					.addComponent(lblNewLabel_1_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cmbConsonante, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnConsonante))
					.addContainerGap(312, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	
	private void añadir() {
		String frase = txtAñadir.getText();
		
		if(Character.isLetter(frase.charAt(0)) && frase != null) {
			frase = frase.toLowerCase();
			switch (frase.charAt(0)) {
				case 'a', 'e', 'i', 'o', 'u':
					cmbVocal.addItem(txtAñadir.getText());
					break;
				default:
					cmbConsonante.addItem(txtAñadir.getText());
					break;
			}
		}else{
			JOptionPane.showMessageDialog(this, "No empieza por una letra" );
		}
		txtAñadir.setText(null);
	}
	
	private void borrarVocal() {
		try {
			int index = cmbVocal.getSelectedIndex();
			
			cmbVocal.removeItemAt(index);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No hay nada que borrar" );
		}
	}
	private void borrarConsonante() {
		try {
			int index = cmbConsonante.getSelectedIndex();
			
			cmbConsonante.removeItemAt(index);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No hay nada que borrar" );
		}
	}
	
	

}
