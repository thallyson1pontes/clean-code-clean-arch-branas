package com.example.cccat17.repository;

import com.example.cccat17.domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CadastroUsuarioIMPLRepository implements CadastroUsuarioRepository {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public Integer salvarNovoUsuario(Usuario dadosCadastrais) {
        entityManager.persist(dadosCadastrais);
        return dadosCadastrais.getCdUsuario();
    }
}
