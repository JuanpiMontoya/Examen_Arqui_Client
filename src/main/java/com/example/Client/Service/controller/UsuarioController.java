package com.example.Client.Service.controller;

import com.example.Client.Service.UsuarioService;
import com.example.Client.Service.api.UsuarioApi;
import com.example.Client.Service.model.UsuarioDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController implements UsuarioApi {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.crearUsuario(usuarioDto);
        return ResponseEntity.ok("Usuario creado exitosamente");
    }

    @GetMapping("/")
    public ResponseEntity<List<UsuarioDto>> obtenerUsuarios() {
        List<UsuarioDto> usuarios = usuarioService.obtenerUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}
