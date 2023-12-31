package io.github.nicholasestrada.clientes.rest;

import io.github.nicholasestrada.clientes.exception.UsuarioCadastradoException;
import io.github.nicholasestrada.clientes.model.entity.Usuario;
import io.github.nicholasestrada.clientes.model.repository.UsuarioRepository;
import io.github.nicholasestrada.clientes.service.UsuarioService;
import org.springframework.http.HttpStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        try {
            service.salvar(usuario);
        }catch (UsuarioCadastradoException e){
            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, e.getMessage() );
        }

    }
}
