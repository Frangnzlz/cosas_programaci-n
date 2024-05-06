package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtApuesta;
	private JTextField txtIntento;
	private JTextField txtInfo;
	private JButton btnMeRindo;
	private JButton btnApuesta;
	private JButton btnSalir;
	private static int intentos = 0, adivina;
	private static Random rn = new Random();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		
		adivina = rn.nextInt(1,101);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Adivina el numero");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 27));
		
		JLabel lblNewLabel_1 = new JLabel("El objetivo del juego es encontrar el numero entre 1 y 100 que ha pensado el ordenador");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2 = new JLabel("Tu Apuesta:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtApuesta = new JTextField();
		txtApuesta.setColumns(10);
		
		btnApuesta = new JButton("Apuesta");
		btnApuesta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apuesta();
			}
		});
		
		btnMeRindo = new JButton("Me Rindo");
		btnMeRindo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rendirse();
			}
		});
		btnMeRindo.setEnabled(false);
		
		JLabel lblNewLabel_3 = new JLabel("#-Intentos:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtIntento = new JTextField();
		txtIntento.setEditable(false);
		txtIntento.setColumns(10);
		txtIntento.setText(String.valueOf(intentos));
		
		JLabel lblNewLabel_3_1 = new JLabel("INFO:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		txtInfo = new JTextField();
		txtInfo.setEditable(false);
		txtInfo.setColumns(10);
		
		btnSalir = new JButton("SALIR");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				salir();
			}
		});
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 0, 255));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 693, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
										.addGap(31)
										.addComponent(txtInfo))
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblNewLabel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(txtApuesta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGap(39)
												.addComponent(btnApuesta)
												.addGap(36)
												.addComponent(btnMeRindo))
											.addComponent(txtIntento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(248)
							.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(31)
					.addComponent(lblNewLabel_1)
					.addGap(49)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtApuesta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnApuesta)
						.addComponent(btnMeRindo))
					.addGap(69)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtIntento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(37)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtInfo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
					.addComponent(btnSalir, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(52))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	//metodo para realizar la apuesta
	private void apuesta() {
		int valor = 0;
		boolean acertado = false;
		try {
			valor = Integer.valueOf(txtApuesta.getText());
			
			if(valor < 1 || valor >100) {
				throw new ArithmeticException();
			}
			
			if(valor > adivina) {
				txtInfo.setText(valor + " es mayor que el numero a adivinar");
			}else if(valor < adivina) {
				txtInfo.setText(valor + " es menor que el numero a adivinar");
			}else if(valor == adivina){
				JOptionPane.showMessageDialog(this, valor + " es el numero correcto. Lo ha conseguido en: " + intentos + " numero de intentos" );
				reiniciar();
				acertado = true;
			}

		} catch (NumberFormatException e1) {
			txtInfo.setText("No has introducido un numero" );
		} catch(ArithmeticException e2) {
			txtInfo.setText("El numero no se encuentra entro los parametros asignados");
		}finally {
			if(!acertado) {
				intentos++;
				btnMeRindo.setEnabled(true);
				txtIntento.setText(String.valueOf(intentos));
			}
		}

		
	}
	
	
	//valor para reiniciar el juego
	private void reiniciar() {
		txtApuesta.setText(null);
		intentos = 0;
		txtIntento.setText(String.valueOf(intentos));
		txtInfo.setText(null);
		adivina  = rn.nextInt(0,101);
		btnMeRindo.setEnabled(false);
		
	}
	
	//metodo para rendirse
	private void rendirse() {
		txtInfo.setText("Te has rendido. El numero era: " + adivina);
		//se llama al metodo reiniciar
		reiniciar();
	}
	
	//metodo para salir
	private void salir() {
		System.exit(0);
	}
}
