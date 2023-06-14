package com.bbasset;

public class FuncionarioFactory {
    public static class Config{
        private String matricula;
        private String nome;
        private int codFuncao;
        private boolean autenticavel;

        public String getMatricula() {
            return matricula;
        }

        public Config setMatricula(String matricula) {
            this.matricula = matricula;
            return this;
        }

        public String getNome() {
            return nome;
        }

        public Config setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public int getCodFuncao() {
            return codFuncao;
        }

        public Config setCodFuncao(int codFuncao) {
            this.codFuncao = codFuncao;
            return this;
        }

        public boolean isAutenticavel() {
            return autenticavel;
        }

        public Config setAutenticavel(boolean autenticavel) {
            this.autenticavel = autenticavel;
            return this;
        }
    }

    public static <T> T criar(Class<T> funci, Config config) {
        if(funci == Diretor.class){
            Diretor diretor = new Diretor();
            diretor.setNome(config.getNome());
            diretor.setMatricula(config.getMatricula());
            diretor.setAutenticavel(config.autenticavel);
            diretor.setCodFuncao(config.getCodFuncao());
            return (T)diretor;
        }
        if(funci == Engenheiro.class){
            Engenheiro engenheiro = new Engenheiro();
            engenheiro.setNome(config.getNome());
            engenheiro.setMatricula(config.getMatricula());
            engenheiro.setAutenticavel(config.autenticavel);
            engenheiro.setCodFuncao(config.getCodFuncao());
            return (T)engenheiro;
        }
        if(funci == Arquiteto.class){
            Arquiteto arquiteto = new Arquiteto();
            arquiteto.setNome(config.getNome());
            arquiteto.setMatricula(config.getMatricula());
            arquiteto.setAutenticavel(config.autenticavel);
            arquiteto.setCodFuncao(config.getCodFuncao());
            return (T)arquiteto;
        }
        if(funci == Gerente.class){
            Gerente gerente = new Gerente();
            gerente.setNome(config.getNome());
            gerente.setMatricula(config.getMatricula());
            gerente.setAutenticavel(config.autenticavel);
            gerente.setCodFuncao(config.getCodFuncao());
            return (T)gerente;
        }
        return null;
    }
}
