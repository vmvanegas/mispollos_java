package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import modelo.UsuarioModelo;
import controlador.UsuarioControlador;

import java.awt.SystemColor;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class RegistroVista extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtCorreo;
	private JTextField txtClave;
	private JTextField txtNombreTienda;
	private JLabel lblNewLabel_6;
	private JTextField txtDireccion;
	private JLabel lblNewLabel_7;
	private JTextField txtTelefono;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_3;
	private JLabel lblRegistro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroVista frame = new RegistroVista();
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
	public RegistroVista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 709);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Lato", Font.PLAIN, 16));
		txtNombre.setBounds(644, 155, 207, 34);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel.setBounds(644, 127, 207, 14);
		contentPane.add(lblNewLabel);
		
		txtApellido = new JTextField();
		txtApellido.setFont(new Font("Lato", Font.PLAIN, 16));
		txtApellido.setColumns(10);
		txtApellido.setBounds(871, 155, 207, 34);
		contentPane.add(txtApellido);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido");
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(871, 127, 207, 17);
		contentPane.add(lblNewLabel_1);
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("Lato", Font.PLAIN, 16));
		txtCorreo.setColumns(10);
		txtCorreo.setBounds(644, 228, 434, 34);
		contentPane.add(txtCorreo);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(644, 200, 207, 14);
		contentPane.add(lblNewLabel_2);
		
		txtClave = new JTextField();
		txtClave.setFont(new Font("Lato", Font.PLAIN, 16));
		txtClave.setColumns(10);
		txtClave.setBounds(644, 301, 434, 34);
		contentPane.add(txtClave);
		
		JLabel lblNewLabel_4 = new JLabel("Contrase\u00F1a");
		lblNewLabel_4.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(644, 273, 207, 14);
		contentPane.add(lblNewLabel_4);
		
		txtNombreTienda = new JTextField();
		txtNombreTienda.setFont(new Font("Lato", Font.PLAIN, 16));
		txtNombreTienda.setColumns(10);
		txtNombreTienda.setBounds(644, 374, 434, 34);
		contentPane.add(txtNombreTienda);
		
		lblNewLabel_6 = new JLabel("Nombre de tienda");
		lblNewLabel_6.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(644, 346, 207, 14);
		contentPane.add(lblNewLabel_6);
		
		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Lato", Font.PLAIN, 16));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(644, 447, 434, 34);
		contentPane.add(txtDireccion);
		
		lblNewLabel_7 = new JLabel("Direccion");
		lblNewLabel_7.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(644, 419, 207, 14);
		contentPane.add(lblNewLabel_7);
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("Lato", Font.PLAIN, 16));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(644, 520, 434, 34);
		contentPane.add(txtTelefono);
		
		lblNewLabel_8 = new JLabel("Telefono");
		lblNewLabel_8.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(644, 492, 207, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Regresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				limpiarFormulario();	
				LoginVista loginVista = new LoginVista();
				loginVista.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Lato", Font.PLAIN, 16));
		btnNewButton.setBounds(644, 575, 110, 34);
		contentPane.add(btnNewButton);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {					
				
				
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String correo = txtCorreo.getText();
				String clave = txtClave.getText();
				String nombreTienda = txtNombreTienda.getText();
				String direccion = txtDireccion.getText();
				String telefono = txtTelefono.getText();
				
				UsuarioModelo usuario = new UsuarioModelo(nombre, apellido, correo, clave, nombreTienda, direccion, telefono);
				
				boolean sw = UsuarioControlador.ingresarUsuario(usuario);
				
				if(sw) {
					System.out.println("Usuario registrado correctamente");
					limpiarFormulario();	
					LoginVista loginVista = new LoginVista();
					loginVista.setVisible(true);
					dispose();
					
				} else {
					System.out.println("Algo salio mal, no se pudo completar tu solicitud");				
				}
				
			}
		});
		
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setBackground(new Color(255, 0, 0));
		btnEnviar.setForeground(Color.WHITE);
		btnEnviar.setFont(new Font("Lato", Font.PLAIN, 16));
		btnEnviar.setBorder(null);
		btnEnviar.setBounds(968, 575, 110, 34);
		contentPane.add(btnEnviar);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\VICTOR\\Pictures\\Screenshots\\mispollos-registro.jpg"));
		lblNewLabel_3.setBounds(0, -57, 531, 788);
		contentPane.add(lblNewLabel_3);
		
		lblRegistro = new JLabel("Registro");
		lblRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistro.setFont(new Font("Lato", Font.PLAIN, 24));
		lblRegistro.setBounds(644, 50, 434, 39);
		contentPane.add(lblRegistro);
	}
	
	public void limpiarFormulario() {
		txtNombre.setText("");
		txtApellido.setText("");
		txtCorreo.setText("");
		txtClave.setText("");
		txtNombreTienda.setText("");
		txtDireccion.setText("");
		txtTelefono.setText("");
	}
}