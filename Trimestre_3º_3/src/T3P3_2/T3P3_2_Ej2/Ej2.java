package T3P3_2.T3P3_2_Ej2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Ej2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFichero;
	private JTextArea txaEntrada;
	private JCheckBox cbxMayusculas;
	private JCheckBox cbxAgregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej2 frame = new Ej2();
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
	public Ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 654, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		txtFichero = new JTextField();
		txtFichero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre del archivo");
		
		cbxAgregar = new JCheckBox("Agregar");
		
		cbxMayusculas = new JCheckBox("MAYUSCULAS");
		
		txaEntrada = new JTextArea();
		
		JButton btnVolcar = new JButton("Volcar");
		btnVolcar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				volcar();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(cbxAgregar, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtFichero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(cbxMayusculas, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(txaEntrada, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(94)
							.addComponent(btnVolcar)))
					.addContainerGap(368, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFichero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbxAgregar)
						.addComponent(cbxMayusculas))
					.addGap(37)
					.addComponent(txaEntrada, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVolcar)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void volcar() {
		if(!txtFichero.getText().isBlank()) {
			try {
				String fichero = "texto\\" + txtFichero.getText() + ".txt";
				File file = new File(fichero);

				String Texto = "" + (cbxMayusculas.isSelected() ? txaEntrada.getText().toUpperCase() : txaEntrada.getText());
				txaEntrada.setText(null);
				
				BufferedWriter writer = new BufferedWriter(new FileWriter("nose.txt",cbxAgregar.isSelected()));
				
				writer.write(Texto);
				writer.newLine();
				writer.close();
				
				
				
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, e.getMessage());
			}
		}else {
			JOptionPane.showMessageDialog(this, "No puede estar el nombre del fichero vacio");
		}
	}
}
