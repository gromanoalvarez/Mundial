package ar.edu.unlam.mundial;

import java.util.Comparator;

public class OrdenEquipoNombreDescendente implements Comparator <Equipo>{

	@Override
	public int compare(Equipo o1, Equipo o2) {
		// TODO Auto-generated method stub
		return (-1) * o1.getNombre().compareTo(o2.getNombre());
	}

}
