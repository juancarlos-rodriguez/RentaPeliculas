package com.renta.peliculas;

public class Alquiler {

    private Disco disco;
    private int diasAlquilado;
    private CalcularAlquilerStrategy strategy;

    public Alquiler(Disco pDisco, int pDiasAlquilado) {
        disco = pDisco;
        diasAlquilado = pDiasAlquilado;

        switch (pDisco.getPelicula().getCodigoPrecio()) {
            case Pelicula.NORMAL:
                this.strategy = new NormalStrategy();
                break;
            case Pelicula.ESTRENO:
                this.strategy = new EstrenoStrategy();
                break;
            case Pelicula.INFANTIL:
                this.strategy = new InfantilStrategy();
                break;
        }

    }

    public int getDiasAlquilado() {

        return diasAlquilado;
    }

    public Disco getDisco() {

        return disco;
    }
    
    public double calcularAlquiler() {
        return strategy.calcularAlquiler(this);
    }
    

}
