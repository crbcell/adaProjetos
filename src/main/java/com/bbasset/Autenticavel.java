package com.bbasset;

public interface Autenticavel<T> {
    boolean autenticavel();
    T setAutenticavel(boolean autenticavel);

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
