package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsMT implements CalculoIcms {
    public IcmsMT() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.17"));
    }
}
