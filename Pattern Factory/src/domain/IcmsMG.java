package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsMG implements CalculoIcms {
    public IcmsMG() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}
