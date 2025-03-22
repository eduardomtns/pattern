package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsGO implements CalculoIcms {
    public IcmsGO() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.19"));
    }
}
