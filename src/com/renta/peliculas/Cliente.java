package com.renta.peliculas;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {

	private String nombre;
    private ArrayList<Alquiler> alquileres = new ArrayList<>();
	
	public Cliente(String pNombre) {
        nombre = pNombre;
    }
	
    public String statement() {
        double montoTotal = 0;
        int puntosAlquilerFrecuente = 0;
        String result = "Alquileres de " + nombre + ":\n";

        for (Alquiler alquiler: alquileres ) {

            double montoAlquiler = 0;
            montoAlquiler += alquiler.calcularAlquiler();
            montoTotal += montoAlquiler;

            puntosAlquilerFrecuente ++;
            // agregar bono por alquiler de pelicula "estreno"
            if ((alquiler.getDisco().getPelicula().getCodigoPrecio() == Pelicula.ESTRENO) && alquiler.getDiasAlquilado() > 1) puntosAlquilerFrecuente ++;

            //mostrar datos
            result += "\t" + alquiler.getDisco().getPelicula().getNombre()+ "\t" + String.valueOf(montoAlquiler) + "\n";

        }
        
        //fin del reporte
        result +=  "Monto total:  " + String.valueOf(montoTotal) + "\n";
        result += "Gano " + String.valueOf(puntosAlquilerFrecuente) + " puntos por alquiler frecuente";
        return result;

    }

	public String getNombre() {
		return nombre;
	}
    
    public void addRental(Alquiler arg) {
    	alquileres.add(arg);
    }

    public static Cliente get(String name) {
    	return (Cliente) Registrar.get("Clientes", name);
    }

    public void persist() {
    	Registrar.add("Clientes", this);
    }

}
