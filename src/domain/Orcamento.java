package model;


import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal value;
    private String name;

    public Orcamento() {
    }

    public Orcamento(BigDecimal value, String name) {
        this.value = value;
        this.name = name;
    }

    public BigDecimal getValorOrcamento() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getIcmsRegiao() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
