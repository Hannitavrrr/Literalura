package com.hanna.LiterAlura.service;


public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
