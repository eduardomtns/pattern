package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsMS implements CalculoIcms {
    public IcmsMS() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}
