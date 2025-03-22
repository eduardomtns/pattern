package model;

import contract.CalculoIcms;
import java.math.BigDecimal;

public class IcmsTO implements CalculoIcms {

    public BigDecimal calculoIcms(Orcamento orcamentoTO) {
        return orcamentoTO.getValorOrcamento().multiply(new BigDecimal("0.18"));
    }
}