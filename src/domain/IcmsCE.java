package model;

import java.math.BigDecimal;
import contract.CalculoIcms;

public class IcmsCE implements CalculoIcms {
    public IcmsCE() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}
