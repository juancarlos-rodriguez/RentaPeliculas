package com.renta.peliculas;

public class NormalStrategy extends CalcularAlquilerStrategy {

    @Override
    public double calcularAlquiler (Alquiler alquiler) {

        double montoAlquiler = 0;

        montoAlquiler += 2;
        if (alquiler.getDiasAlquilado() > 2) {
            montoAlquiler += (alquiler.getDiasAlquilado() - 2) * 1.5;
        }

        return montoAlquiler;
    }

}
