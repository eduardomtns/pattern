package model;


import java.math.BigDecimal;
import contract.CalculoIcms;

public class IcmsAP implements CalculoIcms {
    public IcmsAP() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}