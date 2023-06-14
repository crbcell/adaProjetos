package com.bbasset;

public class Diretor implements Funcionario<Diretor>{

    @Override
    public boolean autenticavel() {
        return false;
    }

    @Override
    public Diretor setAutenticavel(boolean autenticavel) {
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
    public Diretor setMatricula(String matricula) {
        return null;
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public Diretor setNome(String nome) {
        return null;
    }

    @Override
    public Diretor setCodFuncao(int codFuncao) {
        return null;
    }
}
