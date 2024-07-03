package com.example.cccat17.domain;

import jakarta.persistence.*;
import lombok.*;
@Table(name = "TbUsuario")
@Setter @Getter @Builder @Entity
@NoArgsConstructor @AllArgsConstructor
public class Usuario {

    @Id
    @Column(name = "cdUsuario")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cdUsuario;
    @Column(name = "nome")
    private String nome;
    @Column(name ="email")
    private String email;
    @Column(name ="cpfCnpj")
    private String cpfCnpj;
    @Column(name ="placa")
    private String placa;
    @Column(name ="senha")
    private String senha;
    @Column(name ="perfilUsuario")
    private Perfilusuario perfilUsuario;
}
