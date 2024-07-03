package com.example.cccat17.mapper;

import com.example.cccat17.domain.Perfilusuario;
import com.example.cccat17.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioMapper {
    @Autowired
    static Perfilusuario perfilusuario;
    public static Usuario transformaRequestEmUsuario(String nome, String email, String cpfCnpj,
                                                     String placa, String senha, String perfilUsuario) {
        return Usuario.builder()
                .nome(nome)
                .email(email)
                .cpfCnpj(cpfCnpj)
                .placa(placa)
                .senha(senha)
                .perfilUsuario(obterPerfilUsuario(perfilUsuario))
                .build();
    }

    private static Perfilusuario obterPerfilUsuario(String perfil) {
      if (perfil.matches("motorista")){
          return Perfilusuario.MOTORISTA;
      }else return Perfilusuario.PASSAGEIRO;
    }
}
