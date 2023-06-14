package com.bbasset;

public class Arquiteto implements Funcionario<Arquiteto> {
    @Override
    public boolean autenticavel() {
        return false;
    }

    @Override
    public Arquiteto setAutenticavel(boolean autenticavel) {
        return null;
    }

    @Override
    public int getCodFuncao() {
        return 0;
    }

    @Override
    public String getMatricula() {
        return null;
    }

    @Override
    public Arquiteto setMatricula(String matricula) {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public Arquiteto setNome(String nome) {
        return null;
    }

    @Override
    public Arquiteto setCodFuncao(int codFuncao) {
        return null;
    }
}
