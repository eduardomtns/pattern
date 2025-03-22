package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsPE implements CalculoIcms {
    public IcmsPE() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2,5"));
    }
}
