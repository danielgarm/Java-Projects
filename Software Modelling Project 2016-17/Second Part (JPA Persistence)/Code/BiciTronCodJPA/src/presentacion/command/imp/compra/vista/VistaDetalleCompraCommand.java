package presentacion.command.imp.compra.vista;

import presentacion.ListaComandos;
import presentacion.command.Command;
import presentacion.controlador.Contexto;

public class VistaDetalleCompraCommand implements Command 
{
	@Override
	public Contexto execute(Object datos) 
	{
		return new Contexto(ListaComandos.VENTANADETALLECOMPRA, datos);
	}
}
