package com.bbasset.api;

import com.bbasset.Gerente;

public interface Funcionario extends Funcao, Autenticavel {
    String getMatricula();

    Funcionario setMatricula(String matricula);

    String getNome();

    Funcionario setNome(String nome);

    class Builder {
        String matricula;
        String nome;

        public Builder() {
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
