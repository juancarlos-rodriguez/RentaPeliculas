package com.renta.peliculas;

public class InfantilStrategy extends CalcularAlquilerStrategy {

    @Override
    public double calcularAlquiler (Alquiler alquiler) {

        double montoAlquiler = 0;

        montoAlquiler += 1.5;
        if (alquiler.getDiasAlquilado() > 3) {
            montoAlquiler += (alquiler.getDiasAlquilado() - 3) * 1.5;
        }

        return montoAlquiler;
    }

}
