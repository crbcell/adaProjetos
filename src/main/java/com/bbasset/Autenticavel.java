package com.bbasset;

public interface Autenticavel {
    boolean autenticavel();
    Funcionario setAutenticavel(boolean autenticavel);

    class Builder {
        boolean autenticavel;

        public boolean isAutenticavel() {
            return autenticavel;
        }

        public Builder setAutenticavel(boolean autenticavel) {
            this.autenticavel = autenticavel;
            return this;
        }
    }
}
