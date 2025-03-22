package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsDF implements CalculoIcms {
    public IcmsDF() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}
