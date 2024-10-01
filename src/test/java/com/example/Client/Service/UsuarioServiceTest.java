package com.example.Client.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    void testCrearUsuario() {
        // Arrange
        String nombre = "Juan";
        String apellidoPaterno = "Perez";
        String apellidoMaterno = "Garcia";
        String documentoIdentidad = "12345678";

        // Act
        Usuario usuario = usuarioService.crearUsuario(nombre, apellidoPaterno, apellidoMaterno, documentoIdentidad);

        // Assert
        assertEquals(nombre, usuario.getNombre());
        assertEquals(apellidoPaterno, usuario.getApellidoPaterno());
        assertEquals(apellidoMaterno, usuario.getApellidoMaterno());
        assertEquals(documentoIdentidad, usuario.getDocumentoIdentidad());
    }
}
