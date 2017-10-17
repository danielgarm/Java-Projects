package presentacion.command.imp.bicicleta.vista;

import presentacion.ListaComandos;
import presentacion.command.Command;
import presentacion.controlador.Contexto;

public class VistaBotoneraBicicletaCommand implements Command
{
	@Override
	public Contexto execute(Object datos) 
	{
		return new Contexto(ListaComandos.VENTANABOTONERABICICLETA, datos);
	}
}
