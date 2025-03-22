package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsPB implements CalculoIcms {
    public IcmsPB() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2"));
    }
}
