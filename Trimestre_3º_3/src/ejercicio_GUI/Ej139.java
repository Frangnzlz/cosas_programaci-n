package ejercicio_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ej139 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEntrada;
	private JSlider slider = new JSlider();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej139 frame = new Ej139();
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
	public Ej139() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 281);
		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][]", "[][][][][][][][]"));
		
		textEntrada = new JTextField();
		contentPane.add(textEntrada, "cell 4 2 9 1,growx");
		textEntrada.setColumns(10);
		
		JComboBox<String> comboSalida = new JComboBox<>();
		contentPane.add(comboSalida, "cell 4 4 9 1,growx");
		
		JButton btnEntrada = new JButton(">>");
		btnEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textEntrada.getText().isBlank()) {
					comboSalida.addItem(textEntrada.getText());
					textEntrada.setText("");
				}
			}
		});
		slider.setValue(0);
		
		
		

		contentPane.add(slider, "cell 7 5");
		contentPane.add(btnEntrada, "cell 4 7");
		
		JButton btnSalida = new JButton("<<");
		btnSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textEntrada.setText((String)comboSalida.getSelectedItem());
				comboSalida.removeItemAt((comboSalida.getSelectedIndex()));;
			}
		});
		
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				while(true) {
					for(int i = 0; i<=100; i++) {
						//slider.set;
					}
				}
			}
		});
		
		contentPane.add(btnSalida, "cell 12 7");

		
	}	
		
}
