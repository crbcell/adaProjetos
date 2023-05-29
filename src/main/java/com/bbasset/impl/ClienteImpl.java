package com.bbasset.impl;

import com.bbasset.api.Autenticavel;
import com.bbasset.api.Cliente;

public class ClienteImpl implements Cliente {

    private String tipoCliente;
    private String codCliente;
    private boolean autenticavel;

    @Override
    public boolean autenticavel() {
        return false;
    }

    @Override
    public Autenticavel setAutenticavel(boolean autenticavel) {
        this.autenticavel = autenticavel;
        return this;
    }

    @Override
    public String getTipoCliente() {
        return tipoCliente;
    }

    @Override
    public Cliente setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
        return this;
    }

    @Override
    public String getCodCliente() {
        return codCliente;
    }

    @Override
    public Cliente setCodCliente(String codCliente) {
        this.codCliente = codCliente;
        return this;
    }
}
