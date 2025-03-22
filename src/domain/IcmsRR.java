package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsRR implements CalculoIcms {
    public IcmsRR() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.20"));
    }
}