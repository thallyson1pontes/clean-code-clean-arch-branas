package com.example.cccat17.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Perfilusuario {
    MOTORISTA("motorista"),
    PASSAGEIRO("passageiro" );
    private String Descricao;

    public String getPerfilDescricao(String descricao){
        this.Descricao = descricao;
        return descricao;
    }

}
