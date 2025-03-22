package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsRN implements CalculoIcms {
    public IcmsRN() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2"));
    }
}
