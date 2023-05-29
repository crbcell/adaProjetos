package com.bbasset;

import com.bbasset.api.Cliente;
import com.bbasset.api.Funcao;
import com.bbasset.api.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = (Funcionario) new Funcionario.Builder()
                .matricula("F11111")
                .nome("Jose")
                .buildeGerente()
                .setCodFuncao(111);

        System.out.println("BUILDER: Nome do Funcionario: " + gerente.getNome());
        System.out.println("BUILDER: Matricula do Funcionario: " + gerente.getMatricula());
        System.out.println("BUILDER: Cod Funcao do Funcionario: " + gerente.getCodFuncao());
        System.out.println("BUILDER: Funcionário é autenticável: " + gerente.autenticavel());

        System.out.println("----------------------------------------------------------");

        Cliente pessoaFisica = (Cliente) new Cliente.Builder()
                .tipoCliente("PF")
                .codCliente("123.456.789-10")
                .buildePessoaFisica()
                .setAutenticavel(true);
        System.out.println("BUILDER: Cliente do tipo: " + pessoaFisica.getTipoCliente());
        System.out.println("BUILDER: Cliente de codigo: " + pessoaFisica.getCodCliente());
        System.out.println("BUILDER: Cliente é autenticável: " + pessoaFisica.autenticavel());

    }
}