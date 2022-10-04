package Homeworks.Test22;

public enum AllAccountAction {

    REFILL("Положить на счет", 1),
    WITHDRAWAL("Вывести деньги", 2),
    BALANCE("Вывести остаток на счету", 3),
    TERMS("Вывести условия по обслуживанию счета", 4);


    private final String actionName;
    private final int actionIndex;

    AllAccountAction(String actionName, int actionIndex) {
        this.actionIndex = actionIndex;
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return actionIndex + " " + actionName;
    }

}
