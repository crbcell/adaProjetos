package com.bbasset;

public class Gerente implements Funcionario<Gerente> {

    private String matricula;
    private String nome;
    private int codFuncao;
    private boolean autenticavel;

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
        return autenticavel;
    }

    @Override
    public Gerente setAutenticavel(boolean autenticavel) {
        this.autenticavel = autenticavel;
        return this;
    }
}

