package com.renta.peliculas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlquilerTest {

    Alquiler alquiler;
    Disco disco;

    @Before
    public void setUp() throws Exception {
        Pelicula pelicula = new Pelicula("Tres Chiflados", 100);
        disco = new Disco("NumSerie123", pelicula);
        alquiler = new Alquiler(disco, 10);
    }

    @Test
    public void testGetDiasAlquilado() throws Exception {
        Assert.assertEquals(10, alquiler.getDiasAlquilado());
    }

    @Test
    public void testGetDisco() throws Exception {
        Assert.assertSame(disco, alquiler.getDisco());
        Assert.assertEquals("Tres Chiflados", alquiler.getDisco().getPelicula().getNombre());
    }
}