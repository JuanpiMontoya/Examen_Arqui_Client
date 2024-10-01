package com.example.Client.Service;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public Usuario crearUsuario(String nombre, String apellidoPaterno, String apellidoMaterno, String documentoIdentidad) {
        return new Usuario(nombre, apellidoPaterno, apellidoMaterno, documentoIdentidad);
    }
}

