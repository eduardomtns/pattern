package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsSE implements CalculoIcms {
    public IcmsSE() {
    }

    public BigDecimal calculoIcms(Orcamento orcamento) {
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.19"));
    }
}