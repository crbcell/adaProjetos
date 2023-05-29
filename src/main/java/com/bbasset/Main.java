package com.bbasset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario.Builder()
                .matricula("F11111")
                .nome("Jose")
                .buildeGerente()
                .setCodFuncao(115)
                .setAutenticavel(true);

        System.out.println("BUILDER: Nome do Funcionario: "+ gerente.getNome());
        System.out.println("BUILDER: Matricula do Funcionario: "+ gerente.getMatricula());
        System.out.println("BUILDER: Cod Funcao do Funcionario: "+ gerente.getCodFuncao());
        System.out.println("BUILDER: Funcionário é autenticável: "+ gerente.autenticavel());
    }
}