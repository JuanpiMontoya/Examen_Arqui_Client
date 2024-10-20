package com.example.Client.Service;

import com.example.Client.Service.model.UsuarioDto;
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
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setNombre(nombre);
        usuarioDto.setApellidoPaterno(apellidoPaterno);
        usuarioDto.setApellidoMaterno(apellidoMaterno);
        usuarioDto.setDocumentoIdentidad(documentoIdentidad);

        // Act
        Usuario usuario = usuarioService.crearUsuario(usuarioDto);

        // Assert
        assertEquals(nombre, usuario.getNombre());
        assertEquals(apellidoPaterno, usuario.getApellidoPaterno());
        assertEquals(apellidoMaterno, usuario.getApellidoMaterno());
        assertEquals(documentoIdentidad, usuario.getDocumentoIdentidad());
    }
}
