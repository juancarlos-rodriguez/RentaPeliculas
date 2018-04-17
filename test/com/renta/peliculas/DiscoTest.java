package com.renta.peliculas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscoTest {

    private Disco disco;

    @Before
    public void setUp() throws Exception {
        Pelicula pelicula = new Pelicula("Tres Chiflados", 100);
        disco = new Disco("NumSerie123", pelicula);
    }

    @Test
    public void testGetPelicula() throws Exception {
        Assert.assertEquals("Tres Chiflados", disco.getPelicula().getNombre());
    }

    @Test
    public void testGetNumeroSerie() throws Exception {
        Assert.assertEquals("NumSerie123", disco.getNumeroSerie());
    }

    @Test
    public void testSetNumeroSerie() throws Exception {
        disco.setNumeroSerie("NuevoNumSerie123");
        Assert.assertEquals("NuevoNumSerie123", disco.getNumeroSerie());
    }
}