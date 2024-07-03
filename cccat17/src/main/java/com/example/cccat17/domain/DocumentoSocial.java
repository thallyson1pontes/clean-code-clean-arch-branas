package com.example.cccat17.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoSocial {
    private static final int CPF_LENGTH = 11;
    private static final int FACTOR_FIRST_DIGIT = 10;
    private static final int FACTOR_SECOND_DIGIT = 11;
    private String numeroCadastroSocial;



    public void validaDocumentoSocial(String cpfCnpj) throws Exception {
        if (cpfCnpj == null){
            throw new Exception("ERRO PORRA!");
        }
    }
}
