package ar.edu.unlam.mundial;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.TreeSet;

import org.junit.Test;

public class MundialTest {

	@Test
	public void queSePuedaCargarUnEquipoAUnMundial() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));

	}

	@Test
	public void quesePuedaFormarUnGrupoAlMundial() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));
		Equipo arabia = new Equipo(2, "arabia");

		Equipo mex = new Equipo(3, "Mexico");
		Equipo pol = new Equipo(4, "Polonia");
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mex);
		qatar.agregarEquipo(pol);

		String id = "c";

		AsignacionEquiporGrupo asignacioArg = new AsignacionEquiporGrupo(id, arg);
		assertTrue(qatar.agregarAsiganacionEquipoGrupo(asignacioArg));

	}

	@Test
	public void queNosePuedaAgrerUnEquipoA2gruposDistintosUnGrupoAlMundial() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));
		Equipo arabia = new Equipo(2, "arabia");

		Equipo mex = new Equipo(3, "Mexico");
		Equipo pol = new Equipo(4, "Polonia");
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mex);
		qatar.agregarEquipo(pol);

		String id = "c";

		AsignacionEquiporGrupo asignacioArg = new AsignacionEquiporGrupo(id, arg);
		assertTrue(qatar.agregarAsiganacionEquipoGrupo(asignacioArg));

		AsignacionEquiporGrupo asignacioArg2 = new AsignacionEquiporGrupo("d", arg);
		assertFalse(qatar.agregarAsiganacionEquipoGrupo(asignacioArg2));

	}

	@Test
	public void queSePuedaObtenerUnaListaDeequiposDeUnGruporOrdenadaPorNombreDeeQuipo() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));
		Equipo arabia = new Equipo(2, "Arabia");

		Equipo mex = new Equipo(3, "Mexico");
		Equipo pol = new Equipo(4, "Polonia");
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mex);
		qatar.agregarEquipo(pol);

		String id = "c";

		AsignacionEquiporGrupo asignacioArg = new AsignacionEquiporGrupo(id, arg);
		qatar.agregarAsiganacionEquipoGrupo(asignacioArg);
		AsignacionEquiporGrupo asignaciomex = new AsignacionEquiporGrupo(id, mex);
		qatar.agregarAsiganacionEquipoGrupo(asignaciomex);
		AsignacionEquiporGrupo asignacioPol = new AsignacionEquiporGrupo(id, pol);
		qatar.agregarAsiganacionEquipoGrupo(asignacioPol);
		AsignacionEquiporGrupo asignacionArabia = new AsignacionEquiporGrupo(id, arabia);
		qatar.agregarAsiganacionEquipoGrupo(asignacionArabia);

		TreeSet<Equipo> listaObtenida = qatar.obtenerEquiposDeunGrupo(id);

		assertEquals("Arabia", listaObtenida.first().getNombre());
		assertEquals("Polonia", listaObtenida.last().getNombre());

		int i = 0;
		for (Equipo equipo : listaObtenida) {

			switch (i) {
			case 0:
				assertEquals("Arabia", equipo.getNombre());
				break;

			case 1:
				assertEquals("Argentina", equipo.getNombre());
				break;

			case 2:
				assertEquals("Mexico", equipo.getNombre());
				break;

			case 3:
				assertEquals("Polonia", equipo.getNombre());
				break;

			default:
				break;
			}
			i++;
		}
	}

	@Test
	public void queSePuedaObtenerUnaListaDeequiposDeUnGruporOrdenadaPorNombreDeeQuipoDescendente() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));
		Equipo arabia = new Equipo(2, "Arabia");

		Equipo mex = new Equipo(3, "Mexico");
		Equipo pol = new Equipo(4, "Polonia");
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mex);
		qatar.agregarEquipo(pol);

		String id = "c";

		AsignacionEquiporGrupo asignacioArg = new AsignacionEquiporGrupo(id, arg);
		qatar.agregarAsiganacionEquipoGrupo(asignacioArg);
		AsignacionEquiporGrupo asignaciomex = new AsignacionEquiporGrupo(id, mex);
		qatar.agregarAsiganacionEquipoGrupo(asignaciomex);
		AsignacionEquiporGrupo asignacioPol = new AsignacionEquiporGrupo(id, pol);
		qatar.agregarAsiganacionEquipoGrupo(asignacioPol);
		AsignacionEquiporGrupo asignacionArabia = new AsignacionEquiporGrupo(id, arabia);
		qatar.agregarAsiganacionEquipoGrupo(asignacionArabia);

		TreeSet<Equipo> listaObtenida = qatar.obtenerEquiposDeunGrupoOrdenadoNombreDescendente(id);

		assertEquals("Polonia", listaObtenida.first().getNombre());
		assertEquals("Arabia", listaObtenida.last().getNombre());

	}
	
	
	
	
	@Test
	public void queSePuedaObtenerUnaListaDeAsignacionEquiporGrupoOrdenadaPorid() {
		String nombre = "Qatar";
		Mundial qatar = new Mundial(nombre);
		Equipo arg = new Equipo(1, "Argentina");
		assertTrue(qatar.agregarEquipo(arg));
		Equipo arabia = new Equipo(2, "Arabia");

		Equipo mex = new Equipo(3, "Mexico");
		Equipo pol = new Equipo(4, "Polonia");
		qatar.agregarEquipo(arabia);
		qatar.agregarEquipo(mex);
		qatar.agregarEquipo(pol);

		String id = "c";

		AsignacionEquiporGrupo asignacioArg = new AsignacionEquiporGrupo(id, arg);
		qatar.agregarAsiganacionEquipoGrupo(asignacioArg);
		AsignacionEquiporGrupo asignaciomex = new AsignacionEquiporGrupo(id, mex);
		qatar.agregarAsiganacionEquipoGrupo(asignaciomex);
		AsignacionEquiporGrupo asignacioPol = new AsignacionEquiporGrupo(id, pol);
		qatar.agregarAsiganacionEquipoGrupo(asignacioPol);
		AsignacionEquiporGrupo asignacionArabia = new AsignacionEquiporGrupo(id, arabia);
		qatar.agregarAsiganacionEquipoGrupo(asignacionArabia);
		
		id="a";
		
		Equipo qat = new Equipo(5, "Qatar");
		Equipo ecu = new Equipo(6, "Ecuador");
		AsignacionEquiporGrupo asignacioqat = new AsignacionEquiporGrupo(id, qat);
		qatar.agregarAsiganacionEquipoGrupo(asignacioqat);
		AsignacionEquiporGrupo asignacionEcu = new AsignacionEquiporGrupo(id, ecu);
		qatar.agregarAsiganacionEquipoGrupo(asignacionEcu);
		
		
		TreeSet<AsignacionEquiporGrupo> listaObtenida = qatar.obtenerAsiganacionPorgrupoOrdenadaPorId();
		
		
	System.out.println();
		
	
	}
	
}