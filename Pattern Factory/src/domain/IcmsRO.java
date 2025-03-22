package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsRO implements CalculoIcms {
    public IcmsRO() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.195"));
    }
}