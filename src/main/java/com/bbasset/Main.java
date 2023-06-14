package com.bbasset;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gerente> listaGerente = new ArrayList() {{
            add(new Funcionario.Builder().nome("Cristian").matricula("teste").build(Gerente.class));
            add(new Funcionario.Builder()
                    .build(Gerente.class)
                    .setNome("Cri")
                    .setMatricula("Tes")
                    .setAutenticavel(true)
                    .setCodFuncao(111));
        }};

        for (Funcionario f : listaGerente) {
            System.out.println("Nome = " + f.getNome());
            System.out.println("Matricula = " + f.getMatricula());
            System.out.println("Autenticave: " + f.autenticavel());
            System.out.println("Codigo de funcao: " + f.getCodFuncao());
            System.out.println("===================================================");
        }

        Diretor diretor = FuncionarioFactory.criar(
                Diretor.class,
                new FuncionarioFactory.Config()
                        .setNome("Pablo")
                        .setMatricula("F3333333")
                        .setAutenticavel(true)
                        .setCodFuncao(222)
        );

        System.out.println("----------------------------------------------------------");

        List<Funcionario> listaFunci = new ArrayList() {{
            add(new Gerente().setNome("Cristian").setMatricula("F11111").setAutenticavel(true).setCodFuncao(1111));
            add(new Gerente().setNome("Jessica").setMatricula("F222222").setAutenticavel(true).setCodFuncao(1111));
        }};


        for (Funcionario f : listaFunci) {
            System.out.println("Nome = " + f.getNome());
            System.out.println("Matricula = " + f.getMatricula());
            System.out.println("Autenticave: " + f.autenticavel());
            System.out.println("Codigo de funcao: " + f.getCodFuncao());
            System.out.println("===================================================");
        }
    }
}