package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsMA implements CalculoIcms {
    public IcmsMA() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.23"));
    }
}
