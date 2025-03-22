package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsSP implements CalculoIcms {
    public IcmsSP() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}