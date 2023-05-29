package com.bbasset;

public class FuncionarioImpl implements Funcionario {
    private String matricula;
    private String nome;
    private int codFuncao;
    private boolean autenticavel;

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public Funcionario setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public Funcionario setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public int getCodFuncao() {
        return codFuncao;
    }

    @Override
    public Funcionario setCodFuncao(int codFuncao) {
        this.codFuncao = codFuncao;
        return this;
    }

    @Override
    public boolean autenticavel() {
        return true;
    }

    @Override
    public Funcionario setAutenticavel(boolean autenticavel) {
        this.autenticavel = autenticavel;
        return this;
    }
}
