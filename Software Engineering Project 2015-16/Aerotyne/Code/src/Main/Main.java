package Main;

import Presentacion.Controlador.Controlador;
import Presentacion.Controlador.ControladorImp;

public class Main {
	public static void main (String [] args) {
		Controlador.getInstance().accion(ControladorImp.VISTA_PRINCIPAL, null);
	}
}
