package com.renta.peliculas;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeliculaTest {

    Pelicula pelicula;

    @Before
    public void setUp() throws Exception {
        pelicula = new Pelicula("Tres Chiflados", 0);
    }

    @Test
    public void testGetCodigoPrecio() throws Exception {
        Assert.assertEquals(0, pelicula.getCodigoPrecio());
    }

    @Test
    public void testPersistAndGet() throws Exception {
        pelicula.persist();
        Assert.assertSame(pelicula, Pelicula.get("Tres Chiflados"));
    }

    @Test
    public void testGetAndSetNombre() throws Exception {
        Assert.assertEquals("Tres Chiflados", pelicula.getNombre());
        pelicula.setNombre("Lo que el viento se llevó");
        Assert.assertEquals("Lo que el viento se llevó", pelicula.getNombre());
    }
}