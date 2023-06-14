package com.bbasset;

public class Engenheiro implements Funcionario<Engenheiro> {

    @Override
    public boolean autenticavel() {
        return false;
    }

    @Override
    public Engenheiro setAutenticavel(boolean autenticavel) {
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
    public Engenheiro setMatricula(String matricula) {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public Engenheiro setNome(String nome) {
        return null;
    }

    @Override
    public Engenheiro setCodFuncao(int codFuncao) {
        return null;
    }
}
