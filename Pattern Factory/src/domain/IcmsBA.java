package model;

import java.math.BigDecimal;
import contract.CalculoIcms;
public class IcmsBA implements CalculoIcms {
    public IcmsBA() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}