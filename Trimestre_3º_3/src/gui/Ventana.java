package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JTextField textResult;
	private JTextField textObserv;
	private JTextField textProvincia;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel TextoAlumno = new JLabel("Alumno");
		TextoAlumno.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel NombreAlumno = new JLabel("Nombre");
		NombreAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldNombre = new JTextField();
		textFieldNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				textFieldNombre.setText(textFieldNombre.getText().toUpperCase());
			}
		});

		textFieldNombre.setColumns(10);
		
		JLabel apellidosAlumno = new JLabel("Apellidos");
		apellidosAlumno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textFieldApellido = new JTextField();
		textFieldApellido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				textFieldApellido.setText(textFieldApellido.getText().toUpperCase());
			}
		});
		
		textFieldApellido.setColumns(10);
		
		JButton Buton = new JButton("Saludar");


		
		JButton salirButon = new JButton("Salir");
		salirButon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		salirButon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				salirButon.setText("No me pulses");

			}
			@Override
			public void mouseExited(MouseEvent e) {
				salirButon.setText("Salir");
			}
		});
		salirButon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JButton volver = new JButton("Volver");
		
		JLabel lblNewLabel = new JLabel("Sexo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JRadioButton radHombre = new JRadioButton("Hombre");
		radHombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textResult.setEnabled(true);

				textResult.setText(radHombre.getText());
			}
		});
		radHombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JRadioButton radMujer = new JRadioButton("Mujer");
		radMujer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radMujer.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textResult.setEnabled(true);

				textResult.setText(radMujer.getText());
			}
		});
		
		JRadioButton radNB = new JRadioButton("NB");
		radNB.setFont(new Font("Tahoma", Font.PLAIN, 12));
		radNB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				textResult.setEnabled(true);

				textResult.setText(radNB.getText());
			}
		});
		
		ButtonGroup groupSex = new ButtonGroup();
		groupSex.add(radNB);
		groupSex.add(radHombre);
		groupSex.add(radMujer);
		
		JLabel lblNewLabel_1 = new JLabel("Conocimiento");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JCheckBox chckJava = new JCheckBox("Java");
		
		JCheckBox chckHtml = new JCheckBox("HTML");
		
		JCheckBox chckIngles = new JCheckBox("Inglés");
		
		textResult = new JTextField();
		textResult.setEnabled(false);
		textResult.setEditable(false);
		textResult.setColumns(10);
		
		textObserv = new JTextField();
		textObserv.setColumns(10);
		
		JComboBox provinciaBox = new JComboBox();
		provinciaBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		provinciaBox.setModel(new DefaultComboBoxModel(new String[] {"Málaga", "Sevilla", "Granada", "Huelva", "Cadiz", "Cordoba", "Almeria", "Jaen"}));
		
		JLabel lblNewLabel_3 = new JLabel("provincia");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		textProvincia = new JTextField();
		textProvincia.setColumns(10);
		
		JButton btnAñadirProvincia = new JButton("Añadir Provincia");
		btnAñadirProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nueva = textProvincia.getText();
				if(nueva.length()>0) {
					provinciaBox.addItem(nueva);
				}
				textProvincia.setText("");
				
			}
		});
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Nombre", "Apellido"},
			},
			new String[] {
				"Nombre", "Apellido"
			}
		));
		
		JButton btnAnadir = new JButton("Añadir");
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filaSeleccionada = table.getSelectedRow();
				
				if(filaSeleccionada >0) {
					DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
					modeloTabla.removeRow(filaSeleccionada);
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para borrar.");
				}
			}
		});
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(419, Short.MAX_VALUE)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(provinciaBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textProvincia, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
					.addGap(111))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckJava, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckHtml, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(chckIngles, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
									.addGap(128)
									.addComponent(btnAñadirProvincia))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(apellidosAlumno, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(NombreAlumno, GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(radHombre, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(radMujer)
									.addGap(18)
									.addComponent(radNB, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addComponent(TextoAlumno)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldApellido, GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textFieldNombre))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(Buton)
							.addGap(30)
							.addComponent(salirButon)
							.addGap(53)
							.addComponent(volver)
							.addGap(39)
							.addComponent(btnAnadir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBorrar))
						.addComponent(textObserv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(242, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(TextoAlumno)
							.addGap(51)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(NombreAlumno)
								.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(apellidosAlumno)
								.addComponent(textFieldApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel)
								.addComponent(radHombre)
								.addComponent(radMujer)
								.addComponent(radNB)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(textResult, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textProvincia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(chckJava))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckHtml)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckIngles)
							.addPreferredGap(ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
							.addComponent(textObserv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(39))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(22)
							.addComponent(provinciaBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(btnAñadirProvincia)))
					.addGap(132)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Buton)
						.addComponent(volver)
						.addComponent(salirButon)
						.addComponent(btnAnadir)
						.addComponent(btnBorrar))
					.addGap(43))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(449, Short.MAX_VALUE)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
		);
		
		if(radHombre.isSelected()) {
			textResult.setEnabled(true);
			textResult.setEditable(true);
			textResult.setText(radHombre.getText());
		}
		if(radMujer.isSelected()) {
			textResult.setEnabled(true);
			textResult.setEditable(true);
			textResult.setText(radHombre.getText());
		}
		if(radNB.isSelected()) {
			textResult.setEnabled(true);
			textResult.setEditable(true);
			textResult.setText(radNB.getText());
		}
		
		Buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = "Hola ";
				
				nombre += textFieldNombre.getText() + " ";
				
				nombre += textFieldApellido.getText() + " sabes: ";
				if(chckJava.isSelected()) {
					nombre += chckJava.getText() + " ";
				}
				if(chckHtml.isSelected()) {
					nombre += chckHtml.getText() + " ";
				}
				if(chckIngles.isSelected()) {
					nombre += chckIngles.getText();
				}
				textObserv.setText(nombre);
			}
		});
		volver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNombre.setText("");
				textFieldApellido.setText("");
				
				radHombre.setSelected(false);
				radMujer.setSelected(false);
				radNB.setSelected(false);
				
				chckJava.setSelected(false);
				chckHtml.setSelected(false);
				chckIngles.setSelected(false);
				
				textObserv.setText("");
				
			}
		});
		
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = textFieldNombre.getText();
				String apellido = textFieldApellido.getText();
				
				if(nombre.length() > 0 && apellido.length() > 0) {
					ArrayList<String> valores = new ArrayList<>();
					valores.add(nombre);
					valores.add(apellido);
					
					DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
					
					modeloTabla.addRow(valores.toArray());
				}
				else {
					JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
				}
				
			}
		});
		
		contentPane.setLayout(gl_contentPane);
	}
}
