package Homeworks.Test22;

public enum AllAccountTypes {

    INDIVIDUAL("Физическое лицо", 1),
    LEGALENTYTY("Юридическое лицо", 2),
    SELFEMPLOYED("Индивидуальный предприниматель", 3);


    private final String typeName;
    private final int typeIndex;

    AllAccountTypes(String actionName, int actionIndex) {
        this.typeIndex = actionIndex;
        this.typeName = actionName;
    }

    @Override
    public String toString() {
        return typeIndex + " " + typeName;
    }

}
