package com.example.cccat17.service;

import com.example.cccat17.domain.Usuario;
import com.example.cccat17.repository.CadastroUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.cccat17.ValidacaoCpfUsuario.validaCampos;

@Service
public class CadastroUsuarioService {
    @Autowired
    CadastroUsuarioRepository cadastroUsuarioRepository;
    public void criarPerfilDeUsuario(Usuario usuario) throws Exception {
        Usuario dadosCadastrais = validaCampos(usuario);
        Integer cdUsuario = cadastroUsuarioRepository.salvarNovoUsuario(dadosCadastrais);

    }
}
