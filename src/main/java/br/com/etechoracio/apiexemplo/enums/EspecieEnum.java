package br.com.etechoracio.apiexemplo.enums;

public enum EspecieEnum {
    HUMANO("Humano"),
    ALIENIGENA("Alien"),
    ANDROIDE("Androide"),
    KAIOSHIN("Kaioshin"),
    DEUS_DESTRUICAO("Deus-da-Destruição");

    private String label;

    private EspecieEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public static EspecieEnum getBy(int ordinal) {
        return EspecieEnum.values()[ordinal];
    }

}
