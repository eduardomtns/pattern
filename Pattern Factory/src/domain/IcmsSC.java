package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsSC implements CalculoIcms {
    public IcmsSC() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}