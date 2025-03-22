package model;


import java.math.BigDecimal;
import contract.CalculoIcms;

public class IcmsAM implements CalculoIcms {
    public IcmsAM() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}
