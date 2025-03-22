package factory;

import contract.CalculoIcms;
import model.*;


public class IcmsFactory {
    public IcmsFactory() {
    }

    public CalculoIcms getIcmsByName(String nomeEstado) {
        if (nomeEstado.equalsIgnoreCase("ICMS_AC")) {
            return new IcmsAC();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_AL")) {
            return new IcmsAL();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_AM")) {
            return new IcmsAM();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_AP")) {
            return new IcmsAP();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_BA")) {
            return new IcmsBA();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_CE")) {
            return new IcmsCE();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_DF")) {
            return new IcmsDF();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_ES")) {
            return new IcmsES();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_GO")) {
            return new IcmsGO();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MA")) {
            return new IcmsMA();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MT")) {
            return new IcmsMT();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MS")) {
            return new IcmsMS();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_MG")) {
            return new IcmsMG();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_PA")) {
            return new IcmsPA();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_PB")) {
            return new IcmsPB();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_PR")) {
            return new IcmsPR();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_PE")) {
            return new IcmsPE();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_PI")) {
            return new IcmsPI();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RN")) {
            return new IcmsRN();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RS")) {
            return new IcmsRS();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RO")) {
            return new IcmsRO();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_RR")) {
            return new IcmsRR();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SC")) {
            return new IcmsSC();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SE")) {
            return new IcmsSE();
        } else if (nomeEstado.equalsIgnoreCase("ICMS_SP")) {
            return new IcmsSP();
        } else {
            return nomeEstado.equalsIgnoreCase("ICMS_TO") ? new IcmsTO() : null;
        }
    }
}
