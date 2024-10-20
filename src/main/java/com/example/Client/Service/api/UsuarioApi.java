package com.example.Client.Service.api;

import com.example.Client.Service.model.ErrorResponse;
import com.example.Client.Service.model.UsuarioDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

@Tag(name = "Usuarios", description = "API para la gestión de usuarios")
public interface UsuarioApi {

    @Operation(summary = "Crear un nuevo usuario", description = "Crea un usuario con nombre, apellidos y documento de identidad.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuario creado exitosamente"),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)))
    })
    ResponseEntity<String> crearUsuario(UsuarioDto usuarioDto);
}
