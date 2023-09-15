package ar.unlam.intraconsulta;

public class CicloLectivo {

	private Integer id;
	private String cuatrimestre;
	private Integer anio;

	public CicloLectivo(Integer id, String cuatrimestre, Integer anio) {
		this.id = id;
		this.cuatrimestre = cuatrimestre;
		this.anio = anio;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCuatrimestre() {
		return cuatrimestre;
	}

	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

}
