package com.renta.peliculas;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegistrarTest {

    Registrar registrar = new Registrar();

    @Test
    public void testAddAndGetClientes() throws Exception {

        Cliente cliente = new Cliente("Mario");
        registrar.add("Clientes", cliente);
        Cliente clienteMario = (Cliente) registrar.get("Clientes", "Mario");
        Assert.assertEquals("Mario", clienteMario.getNombre());

        cliente = new Cliente("Juanca");
        registrar.add("Clientes", cliente);
        Cliente clienteJuanca = (Cliente) registrar.get("Clientes", "Juanca");
        Assert.assertEquals("Juanca", clienteJuanca.getNombre());

    }

    @Test
    public void testAddAndGetPeliculas() throws Exception {

        Pelicula pelicula = new Pelicula("Tres Chiflados", 100);
        System.out.println(pelicula);
        registrar.add("Peliculas", pelicula);
        Pelicula pelicula3Chiflados = (Pelicula) registrar.get("Peliculas", "Tres Chiflados");
        Assert.assertEquals("Tres Chiflados", pelicula3Chiflados.getNombre());
        Assert.assertEquals(100, pelicula3Chiflados.getCodigoPrecio());

    }
}