package com.example.cccat17;

import com.example.cccat17.domain.DocumentoSocial;
import com.example.cccat17.domain.Usuario;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Getter
@Builder
@Setter
public class ValidacaoCpfUsuario{

    public static Usuario validaCampos(Usuario usuario) throws Exception {
        validaEmail(usuario.getEmail());
        validaNome(usuario.getNome());
        return usuario;
    }
    private static void validaEmail(String email) throws Exception {
        if (email != null || !email.isEmpty()) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (!matcher.matches()) {
                throw new Exception("Email Invalido");
            }
        }
    }

    private static void validaNome(String nome) throws Exception {
        if (! nome.isEmpty()) {}    }

    private static void validaCpfCnpj(DocumentoSocial cpfCnpj) {
    }
}
