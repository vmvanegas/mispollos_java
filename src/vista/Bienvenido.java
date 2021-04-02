package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.UsuarioModelo;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Bienvenido extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenido frame = new Bienvenido();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Bienvenido(UsuarioModelo usuario) {	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido");
		lblNewLabel.setFont(new Font("Lato", Font.PLAIN, 24));
		lblNewLabel.setBounds(25, 32, 157, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Info de usuario");
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(25, 101, 280, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNombre.setBounds(25, 149, 280, 26);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setFont(new Font("Lato", Font.PLAIN, 16));
		lblApellido.setBounds(25, 197, 280, 26);
		contentPane.add(lblApellido);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setFont(new Font("Lato", Font.PLAIN, 16));
		lblCorreo.setBounds(25, 245, 280, 26);
		contentPane.add(lblCorreo);
		
		JLabel lblNombreTienda = new JLabel("Nombre de tienda:");
		lblNombreTienda.setFont(new Font("Lato", Font.PLAIN, 16));
		lblNombreTienda.setBounds(25, 293, 280, 26);
		contentPane.add(lblNombreTienda);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Lato", Font.PLAIN, 16));
		lblDireccion.setBounds(25, 341, 280, 26);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setFont(new Font("Lato", Font.PLAIN, 16));
		lblTelefono.setBounds(25, 389, 280, 26);
		contentPane.add(lblTelefono);
		
		lblNombre.setText(lblNombre.getText() + " " + usuario.getNombre());
		lblApellido.setText(lblApellido.getText() + " " + usuario.getApellido());
		lblCorreo.setText(lblCorreo.getText() + " " + usuario.getCorreo());
		lblNombreTienda.setText(lblNombreTienda.getText() + " " + usuario.getNombreTienda());
		lblDireccion.setText(lblDireccion.getText() + " " + usuario.getDireccion());
		lblTelefono.setText(lblTelefono.getText() + " " + usuario.getTelefono());
		
	}
}
