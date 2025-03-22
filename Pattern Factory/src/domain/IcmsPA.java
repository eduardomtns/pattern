package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsPA implements CalculoIcms {
    public IcmsPA() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.19"));
    }
}
