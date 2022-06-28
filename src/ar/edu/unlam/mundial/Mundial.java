package ar.edu.unlam.mundial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Mundial {

	private String nombre;
	private Set<Equipo> equipos;
	private List<AsignacionEquiporGrupo> asignacionEquipoGrupo;
	

	public Mundial(String nombre) {
		this.nombre=nombre;
		this.equipos=new HashSet<>();
		this.asignacionEquipoGrupo=new ArrayList<>();

}

	public Boolean agregarEquipo(Equipo equipo) {
		this.equipos.add(equipo);
		return true;
	}

	public boolean agregarAsiganacionEquipoGrupo(AsignacionEquiporGrupo asignacion) {

		boolean pudoAgregar=false;

		if(buscarEquipoEnAsignacion(asignacion)==null) {
	     	this.asignacionEquipoGrupo.add(asignacion);
		    pudoAgregar=true;
		}
		return pudoAgregar;
	}

	public Equipo buscarEquipoEnAsignacion(AsignacionEquiporGrupo asignacion) {
		for (AsignacionEquiporGrupo asiganacionEquipoGrupo : asignacionEquipoGrupo) {
			if(asiganacionEquipoGrupo.getEquipo().equals(asignacion.getEquipo()))
				return asiganacionEquipoGrupo.getEquipo();
		}
		return null;
	}

	public TreeSet<Equipo> obtenerEquiposDeunGrupo(String id) {

		TreeSet<Equipo> equipos= new TreeSet<>();
		
		for (AsignacionEquiporGrupo asignacionEquipoGrupo : this.asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo.getId().equals(id))
				equipos.add(asignacionEquipoGrupo.getEquipo());
		}
		
		
		
		return equipos;
	}

	public TreeSet<Equipo> obtenerEquiposDeunGrupoOrdenadoNombreDescendente(String id) {
		TreeSet<Equipo> equipos= new TreeSet<>(new OrdenEquipoNombreDescendente());
		
		for (AsignacionEquiporGrupo asignacionEquipoGrupo : this.asignacionEquipoGrupo) {
			if(asignacionEquipoGrupo.getId().equals(id))
				equipos.add(asignacionEquipoGrupo.getEquipo());
		}
		
		
		
		return equipos;
	}

	public TreeSet<AsignacionEquiporGrupo> obtenerAsiganacionPorgrupoOrdenadaPorId() {
		 TreeSet<AsignacionEquiporGrupo> ordenada = new TreeSet <>();

		 ordenada.addAll(asignacionEquipoGrupo);
			 
			
	
		 
		 return ordenada;
	}

}
