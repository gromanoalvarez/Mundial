package ar.edu.unlam.mundial;

public class AsignacionEquiporGrupo implements Comparable<AsignacionEquiporGrupo>{

	private String id;
	private Equipo equipo;

	public AsignacionEquiporGrupo(String id, Equipo equipo) {
		this.id = id;
		this.equipo = equipo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public int compareTo(AsignacionEquiporGrupo o) {
	
		if(this.getId().compareTo(o.getId())==0)
				return this.equipo.getNombre().compareTo(o.getEquipo().getNombre());
		
		
		return this.getId().compareTo(o.getId());
	}




}
