package com.renta.peliculas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {

    Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Mario");
    }

    @Test
    public void testStatement() throws Exception {

        // Pelicula Normal
        Pelicula pelicula = new Pelicula("Tres Chiflados", 0);
        Disco disco = new Disco("NumSerie123", pelicula);
        Alquiler alquiler = new Alquiler(disco, 10);

        cliente.addRental(alquiler);

        // Pelicula Estreno
        pelicula = new Pelicula("Pacific Rim 2", 1);
        disco = new Disco("NumSerie1234", pelicula);
        alquiler = new Alquiler(disco, 20);

        cliente.addRental(alquiler);

        // Pelicula Infantil
        pelicula = new Pelicula("Sirenita", 2);
        disco = new Disco("NumSerie12345", pelicula);
        alquiler = new Alquiler(disco, 10);

        cliente.addRental(alquiler);

        System.out.println(cliente.statement());

        String expectedMsg1 = "Alquileres de Mario:\n" +
                "\tTres Chiflados\t14.0\n" +
                "\tPacific Rim 2\t60.0\n" +
                "\tSirenita\t12.0\n" +
                "Monto total:  86.0\n" +
                "Gano 4 puntos por alquiler frecuente";

        Assert.assertEquals(expectedMsg1, cliente.statement());

        // Otra Pelicula Estreno
        pelicula = new Pelicula("Avengers", 1);
        disco = new Disco("NumSerie12345", pelicula);
        alquiler = new Alquiler(disco, 10);

        cliente.addRental(alquiler);

        String expectedMsg2 = "Alquileres de Mario:\n" +
                "\tTres Chiflados\t14.0\n" +
                "\tPacific Rim 2\t60.0\n" +
                "\tSirenita\t12.0\n" +
                "\tAvengers\t30.0\n" +
                "Monto total:  116.0\n" +
                "Gano 6 puntos por alquiler frecuente";

        System.out.println(cliente.statement());

        Assert.assertEquals(expectedMsg2, cliente.statement());
    }

    @Test
    public void testGetNombre() throws Exception {
        Assert.assertEquals("Mario", cliente.getNombre());
    }

    @Test
    public void testAddRental() throws Exception {
        Pelicula pelicula = new Pelicula("Tres Chiflados", 0);
        Disco disco = new Disco("NumSerie123", pelicula);
        Alquiler alquiler = new Alquiler(disco, 10);

        cliente.addRental(alquiler);


    }

    @Test
    public void testPersistAndGet() throws Exception {
        cliente.persist();
        Assert.assertSame(cliente, Cliente.get("Mario"));
        Assert.assertEquals("Mario", Cliente.get("Mario").getNombre());
    }
}