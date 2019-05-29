package br.com.etechoracio.apiexemplo.enums;

public enum SexoEnum {
    M("Masculino"),
    F("Feminino");

    private String label;

    private SexoEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }


    public static SexoEnum getBy(String id) {
        if (id.toLowerCase().equalsIgnoreCase(SexoEnum.M.getLabel())) {
            return M;
        }
        return F;
    }
}
