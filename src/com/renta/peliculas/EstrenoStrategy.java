package com.renta.peliculas;

public class EstrenoStrategy extends CalcularAlquilerStrategy {

    @Override
    public double calcularAlquiler (Alquiler alquiler) {

        double montoAlquiler = 0;
        montoAlquiler += alquiler.getDiasAlquilado() * 3;

        return montoAlquiler;
    }

}
