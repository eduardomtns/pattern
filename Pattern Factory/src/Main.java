import factory.IcmsFactory;
import model.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento newOrcamento = new Orcamento(new BigDecimal("1000") , "icms_mg");

        IcmsFactory newFactory = new IcmsFactory();

        BigDecimal result =  newFactory.getIcmsByName(newOrcamento.getIcmsRegiao()).calculoIcms(newOrcamento);
        System.out.println(result);
    }
}