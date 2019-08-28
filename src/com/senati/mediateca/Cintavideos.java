package com.senati.mediateca;

public class Cintavideos extends Soporte {
	String actores;
	int duracion;
	
	public Cintavideos() {
	    super();
	   }
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Cintavideos [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}


	 public Cintavideos(int id, String titulo, String autor, float precio, String actores, int duracion) {
		    super(id, titulo, autor, precio);
		    this.actores = actores;
		    this.duracion = duracion;
		   }
	
	
	
	   
}
