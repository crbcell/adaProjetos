package com.bbasset;

public interface Cliente<T> extends Autenticavel<T> {
    String getTipoCliente();
    T setTipoCliente(String tipoCliente);

    String getCodCliente();
    T setCodCliente(String codCliente);

    class Builder {
        String tipoCliente;
        String codCliente;

        public Builder() {
        }

        public String tipoCliente() {
            return tipoCliente;
        }

        public Builder tipoCliente(String tipoCliente) {
            this.tipoCliente = tipoCliente;
            return this;
        }

        public String codCliente() {
            return codCliente;
        }

        public Builder codCliente(String codCliente) {
            this.codCliente = codCliente;
            return this;
        }

        public Cliente buildePessoaFisica() {
            return load(new PessoaFisica());
        }

        /*int compareTo(Generic o){
            Cliente cliente = (Cliente) o;
            return (this.codCliente() + "#@#" + this.tipoCliente())
                    .compareTo(cliente.getCodCliente() + "#@#" + cliente.getCodCliente());
        }*/

        public Cliente load(Cliente cliente) {
            cliente.setTipoCliente(tipoCliente);
            cliente.setCodCliente(codCliente);
            return cliente;
        }
    }
}
