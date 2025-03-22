package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsES implements CalculoIcms {
    public IcmsES() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}

