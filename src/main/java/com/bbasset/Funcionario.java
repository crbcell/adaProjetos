package com.bbasset;

public interface Funcionario<T> extends Funcao<T>, Autenticavel<T>, Comparable<T> {

    String getMatricula();

    T setMatricula(String matricula);

    String getNome();

    T setNome(String nome);

    @Override
    T setCodFuncao(int codFuncao);

    default int compareTo(T o) {
        Funcionario funci = (Funcionario) o;
        return (this.getNome() + " #@# " + this.getMatricula())
                .compareTo(funci.getNome() + " #@# " + funci.getMatricula());
    }

    class Builder {
        String matricula;
        String nome;


        public Builder() {

        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }
        public Builder matricula(String matricula) {
            this.matricula = matricula;
            return this;
        }

        public Funcionario buildeGerente() {
            return load(new Gerente());
        }

        public <Z extends Funcionario> Z build(Class<Z> funci) {
            if (funci == Gerente.class) {
                return (Z) load(new Gerente());
            }
            return null;
        }

        private Funcionario load(Funcionario funcionario) {
            funcionario.setMatricula(matricula);
            funcionario.setNome(nome);
            funcionario.setAutenticavel(funcionario.autenticavel());
            funcionario.setCodFuncao(funcionario.getCodFuncao());
            return funcionario;
        }


    }
}
