package com.senati.mediateca;

public class Cintaaudios extends Soporte {
	String lugar;
	int duracion;
	public Cintaaudios(String lugar, int duracion) {
		super();
		this.lugar = lugar;
		this.duracion = duracion;
	}
	
	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Cintaaudios [lugar=" + lugar + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	

}
