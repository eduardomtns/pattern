package model;

import java.math.BigDecimal;

import contract.CalculoIcms;

public class IcmsAC implements CalculoIcms {
    public IcmsAC() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2"));
    }
}
