package br.com.etechoracio.apiexemplo.enums;

public enum StatusEnum {
    VIVO("Vivo"),
    FALECIDO("Falecido"),
    DESAPARECIDO("Desaparecido");

    private String label;

    private StatusEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static StatusEnum getBy(int ordinal) {
        return StatusEnum.values()[ordinal];
    }

}
