package com.bbasset.api;

public interface Autenticavel {
    boolean autenticavel();
    Autenticavel setAutenticavel(boolean autenticavel);

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
