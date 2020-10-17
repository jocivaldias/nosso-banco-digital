package com.jocivaldias.nossobancodigital.domain.enums;

public enum StatusProposta {

    ABERTA(1, "Proposta aberta pelo Cliente"),

    PENDENTE_ENDERECO_CLIENTE(2, "Pendente Endereço"),
    PENDENTE_DOCUMENTACAO_CLIENTE(3, "Pendente Documentação"),
    PENDENTE_CONFIRMACAO_CLIENTE(4, "Pendente Confirmação Cliente"),

    RECUSADA(5, "Recusada pelo Cliente"),

    PENDENTE_LIBERACAO_SISTEMA(6, "Pendente Liberação Sistema"),
    REENVIAR_LIBERACAO_SISTEMA(7, "Reenviar liberação sistema"),

    CANCELADA(8, "Proposta cancelada pelo sistema de validação"),
    LIBERADA(9, "Proposta Efetivada");

    public int cod;
    public String descricao;

    private StatusProposta(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod() {
        return cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusProposta toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (StatusProposta x : StatusProposta.values()) {
            if (cod.equals(x.getCod())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + cod);
    }
}
