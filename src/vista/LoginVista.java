package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.UsuarioControlador;
import modelo.UsuarioModelo;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class LoginVista extends JFrame {

	private JPanel contentPane;
	private JTextField txtCorreo;
	private JTextField txtClave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginVista frame = new LoginVista();
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
	public LoginVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 693);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblCorreo.setBounds(182, 219, 207, 14);
		contentPane.add(lblCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Lato", Font.PLAIN, 16));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(182, 247, 350, 34);
		contentPane.add(txtCorreo);
		
		txtClave = new JTextField();
		txtClave.setFont(new Font("Lato", Font.PLAIN, 16));
		txtClave.setColumns(10);
		txtClave.setBounds(182, 320, 350, 34);
		contentPane.add(txtClave);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Lato", Font.PLAIN, 16));
		lblContrasea.setBounds(182, 292, 207, 14);
		contentPane.add(lblContrasea);
		
		JLabel lblError = new JLabel("Correo o contrase\u00F1a invalidos");
		lblError.setVisible(false);
		lblError.setFont(new Font("Lato", Font.PLAIN, 12));
		lblError.setForeground(Color.RED);
		lblError.setBackground(Color.RED);
		lblError.setBounds(182, 399, 350, 34);
		contentPane.add(lblError);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UsuarioModelo usuario = UsuarioControlador.validarUsuario(txtCorreo.getText(), txtClave.getText());
				
				if(usuario != null) {
					Bienvenido bienvenido = new Bienvenido(usuario);
					bienvenido.setVisible(true);
					dispose();
					lblError.setVisible(false);
				} else {
					System.out.println("Correo o contraseña invalidos");
					lblError.setVisible(true);
				}
				
			}
		});
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setForeground(Color.WHITE);
		btnEntrar.setFont(new Font("Lato", Font.PLAIN, 16));
		btnEntrar.setBorder(null);
		btnEntrar.setBackground(Color.RED);
		btnEntrar.setBounds(182, 365, 350, 34);
		contentPane.add(btnEntrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\VICTOR\\Pictures\\Screenshots\\mispollos-login.jpg"));
		lblNewLabel.setBounds(687, -29, 497, 717);
		contentPane.add(lblNewLabel);
		
		JLabel lblInicioDeSesin = new JLabel("Inicio de sesi\u00F3n");
		lblInicioDeSesin.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicioDeSesin.setFont(new Font("Lato", Font.PLAIN, 24));
		lblInicioDeSesin.setBounds(182, 84, 350, 39);
		contentPane.add(lblInicioDeSesin);
		
		JLabel lblaunNoTienes = new JLabel("\u00BFAun no tienes cuenta?, creala ");
		lblaunNoTienes.setHorizontalAlignment(SwingConstants.CENTER);
		lblaunNoTienes.setFont(new Font("Lato", Font.PLAIN, 16));
		lblaunNoTienes.setBounds(223, 446, 221, 27);
		contentPane.add(lblaunNoTienes);
		
		JLabel lblMispollo = new JLabel("Mis Pollos \u00A9 2020");
		lblMispollo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMispollo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblMispollo.setBounds(182, 515, 350, 27);
		contentPane.add(lblMispollo);
		
		JButton btnAqui = new JButton("aqu\u00ED");
		btnAqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RegistroVista registro = new RegistroVista();
				registro.setVisible(true);
				dispose();
				
			}
		});
		btnAqui.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAqui.setForeground(new Color(255, 0, 0));
		btnAqui.setFont(new Font("Lato", Font.PLAIN, 16));
		btnAqui.setBorder(null);
		btnAqui.setBackground(Color.WHITE);
		btnAqui.setBounds(436, 442, 37, 34);
		contentPane.add(btnAqui);
		
	}
}
