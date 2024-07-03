package com.example.cccat17.repository;

import com.example.cccat17.domain.Usuario;

public interface CadastroUsuarioRepository {
    Integer salvarNovoUsuario(Usuario dadosCadastrais);
}
