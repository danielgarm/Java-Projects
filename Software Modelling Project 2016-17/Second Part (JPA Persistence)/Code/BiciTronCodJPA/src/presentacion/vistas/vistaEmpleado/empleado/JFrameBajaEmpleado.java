package presentacion.vistas.vistaEmpleado.empleado;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import presentacion.ListaComandos;
import presentacion.controlador.Controlador;

public class JFrameBajaEmpleado extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JTextField id;
	private JButton enviar;
	private JButton salir;
	
	public JFrameBajaEmpleado() 
	{
		this.setTitle("Baja empleado");
		this.setLayout(new FlowLayout());
		this.setResizable(false);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent evt) 
			{
				cerrar();
			}
		});

		JPanel buttonPanel = new JPanel(new GridLayout(3, 1));

		id = new JTextField("Id");
		enviar = new JButton("Enviar");
		salir = new JButton("Salir");

		id.setPreferredSize(new Dimension(320, 35));

		enviar.addActionListener(new ActionListenerBajaBicicleta());

		salir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cerrar();
			}
		});

		buttonPanel.add(id);
		buttonPanel.add(enviar);
		buttonPanel.add(salir);
		this.getContentPane().add(buttonPanel);
		this.pack();
	}

	public class ActionListenerBajaBicicleta implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			try 
			{
				Controlador.getInstance().accion(ListaComandos.NEGOCIOBAJAEMPLEADO, Integer.parseInt(id.getText()));
			} 
			catch (NumberFormatException e) 
			{
				JOptionPane.showMessageDialog(null,	"Formato empleado no correcto", "Informacion",	JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

	public void cerrar() 
	{
		id.setText("Id");
		this.setVisible(false);
		Controlador.getInstance().accion(ListaComandos.VENTANABOTONERAEMPLEADO, null);
	}
}