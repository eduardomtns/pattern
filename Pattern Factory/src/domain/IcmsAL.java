package model;

import java.math.BigDecimal;
import contract.CalculoIcms;

public class IcmsAL implements CalculoIcms {
    public IcmsAL() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2"));
    }
}
