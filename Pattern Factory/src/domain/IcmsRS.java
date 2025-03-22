package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsRS implements CalculoIcms {
    public IcmsRS() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}