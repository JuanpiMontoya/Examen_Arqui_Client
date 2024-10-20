package com.example.Client.Service;

import com.example.Client.Service.model.UsuarioDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final List<UsuarioDto> usuarios = new ArrayList<>();

    public Usuario crearUsuario(UsuarioDto usuarioDto) {
        usuarios.add(usuarioDto);
        return new Usuario(usuarioDto.getNombre(), usuarioDto.getApellidoPaterno(), usuarioDto.getApellidoMaterno(), usuarioDto.getDocumentoIdentidad());
    }

    public List<UsuarioDto> obtenerUsuarios() {
        return usuarios;
    }
}
