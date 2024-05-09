package T3P3_2_Ej3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ej3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAñadir;
	private JComboBox<String> cmbVocal, cmbConsonante;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej3 frame = new Ej3();
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
	public Ej3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtAñadir = new JTextField();
		txtAñadir.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				vacio();
			}
		});
		txtAñadir.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese Palabras");
		
		cmbVocal = new JComboBox();
		
		cmbConsonante = new JComboBox();
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setEnabled(false);
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
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
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
										.addComponent(btnConsonante)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(321)
							.addComponent(btnSalir)))
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
					.addGap(32)
					.addComponent(btnSalir)
					.addContainerGap(259, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	
	private void vacio() {
		if(txtAñadir.getText().isBlank()) {
			btnIngresar.setEnabled(false);
		}else {
			btnIngresar.setEnabled(true);
		}
	}
	
	
	
	//Metodo para añadir un elemento
	private void añadir() {
		String frase = txtAñadir.getText();
		
		if (!frase.isBlank()) {
			if (Character.isLetter(frase.charAt(0))) {
				frase = frase.toLowerCase();
				switch (frase.charAt(0)) {
				case 'a', 'e', 'i', 'o', 'u':
					cmbVocal.addItem(txtAñadir.getText());
					break;
				default:
					cmbConsonante.addItem(txtAñadir.getText());
					break;
				}
			} else {
				JOptionPane.showMessageDialog(this, "No empieza por una letra");
			}
			txtAñadir.setText(null);
		}
	}
	
	//metodo para borrar el objeto seleccionado en la comboBox de vocales
	private void borrarVocal() {
		try {
			int index = cmbVocal.getSelectedIndex();
			
			cmbVocal.removeItemAt(index);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No hay nada que borrar" );
		}
	}
	
	//metodo para borrar el objeto seleccionado en la comboBox de consonante
	private void borrarConsonante() {
		try {
			int index = cmbConsonante.getSelectedIndex();
			
			cmbConsonante.removeItemAt(index);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "No hay nada que borrar" );
		}
	}
	//metodo para salir
	 private void salir() {
			System.exit(0);
	 }

}
