package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsRJ implements CalculoIcms {
    public IcmsRJ() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.2"));
    }
}
