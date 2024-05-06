package ejercicio_GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Ej138 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textEntrada;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ej138 frame = new Ej138();
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
	public Ej138() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][][][][][][][][grow][][][grow]", "[][][][][][][grow]"));
		
		textEntrada = new JTextField();


		contentPane.add(textEntrada, "cell 0 2 12 1,growx");
		textEntrada.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setForeground(new Color(255, 255, 255));
		textArea.setBackground(new Color(0, 0, 0));
		contentPane.add(textArea, "cell 0 4 12 2,grow");
		
		
		
		textEntrada.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				textArea.setText(textEntrada.getText());
			}
		});
		textEntrada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(textArea.getText().concat("\n"));
				
			}
		});
		
		
		
		JButton btnTexto = new JButton("Salida");
		btnTexto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(textEntrada.getText());
				
				textEntrada.setText("");
			}
		});
		contentPane.add(btnTexto, "cell 2 6");
		
		JToggleButton btnCambiarSalida = new JToggleButton("Cambiar Color");

		btnCambiarSalida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!btnCambiarSalida.isSelected()) {
					textArea.setForeground(new Color(255, 255, 255));
					textArea.setBackground(new Color(0, 0, 0));
				}else {
					textArea.setForeground(new Color(0, 0, 255));
					textArea.setBackground(new Color(255, 255, 255));
				}
			}
		});
		

		contentPane.add(btnCambiarSalida, "cell 9 6");
	}

}
