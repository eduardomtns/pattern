package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsPI implements CalculoIcms {
    public IcmsPI() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.22,5"));
    }
}
