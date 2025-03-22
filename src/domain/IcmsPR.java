package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsPR implements CalculoIcms {
    public IcmsPR() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.195"));
    }
}
