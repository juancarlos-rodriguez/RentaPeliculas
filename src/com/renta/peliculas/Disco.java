package com.renta.peliculas;

public class Disco {

	private String numeroSerie;
	private Pelicula pelicula;

    public Disco(String pNumeroSerie, Pelicula pPelicula) {
        setNumeroSerie(pNumeroSerie);
        pelicula = pPelicula;
    }

	public Pelicula getPelicula() {
    	return pelicula;
    }
    
    public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


}
