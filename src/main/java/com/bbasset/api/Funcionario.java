package com.bbasset.api;

import com.bbasset.Gerente;

public interface Funcionario<T> extends Funcao<T>, Autenticavel<T>, Comparable {
    @Override
    int compareTo(Object o);

    String getMatricula();

    T setMatricula(String matricula);

    String getNome();

    T setNome(String nome);

    @Override
    T setCodFuncao(int codFuncao);

    class Builder {
        String matricula;
        String nome;

        public <Z extends Funcionario> Z build(Class<Z> clz) {
            return null;
        }

        public Builder matricula(String matricula) {
            this.matricula = matricula;
            return this;
        }
        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Funcionario buildeGerente() {
            return load(new Gerente());
        }

        private Funcionario load(Funcionario funcionario) {
            funcionario.setMatricula(matricula);
            funcionario.setNome(nome);
            return funcionario;
        }


    }
}
