package com.example.cccat17.controller;

import com.example.cccat17.domain.Usuario;
import com.example.cccat17.mapper.UsuarioMapper;
import com.example.cccat17.service.CadastroUsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("corridas")
public class CadastroUsuarioController {

    private final CadastroUsuarioService corridaService;

    @RequestMapping(value = "/criar")
    public int criarIdConta(@RequestHeader String nome, @RequestHeader String email, @RequestHeader String cpfCnpj,
                            @RequestHeader String placa, @RequestHeader String senha, @RequestHeader String perfilUsuario) throws Exception {
        try {
            Usuario request = UsuarioMapper.transformaRequestEmUsuario(nome, email, cpfCnpj, placa, senha, perfilUsuario);
            corridaService.criarPerfilDeUsuario(request);
            return 5;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
