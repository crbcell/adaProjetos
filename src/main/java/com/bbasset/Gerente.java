package com.bbasset;

import com.bbasset.api.Funcionario;

public class Gerente implements Funcionario {
    private String matricula;
    private String nome;
    private int codFuncao;
    private boolean autenticvel;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public Gerente setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Gerente setNome(String nome) {
        this.nome = nome;
        return this;
    }


    @Override
    public int getCodFuncao() {
        return codFuncao;
    }

    @Override
    public Gerente setCodFuncao(int codFuncao) {
        this.codFuncao = codFuncao;
        return this;
    }

    @Override
    public boolean autenticavel() {
        return autenticvel;
    }

    @Override
    public Gerente setAutenticavel(boolean autenticavel) {
        this.autenticvel = autenticavel;
        return this;
    }
}
