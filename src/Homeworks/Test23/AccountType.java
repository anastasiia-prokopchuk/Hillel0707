package Homeworks.Test23;

import java.util.*;

public class AccountType {

    private final HashMap<String, Client> ACCOUNT_TYPES = new HashMap<>();

    public void addingAccountType() {
        ACCOUNT_TYPES.put("1", new Individual(1));
        ACCOUNT_TYPES.put("2", new LegalEntity(100));
        ACCOUNT_TYPES.put("3", new SelfEmployed(1000));
    }

    public void printAccountTypes() {
        for (AllAccountTypes type : AllAccountTypes.values()) {
            System.out.println(type);
        }
    }

    public Client accountSelectedType() {
        System.out.println("Выберите какой Вы клиент? (введите 1, 2 или 3)");
        String userEnteredType = new Scanner(System.in).nextLine();
        Client userType = null;

        for (Map.Entry<String, Client> type : ACCOUNT_TYPES.entrySet()) {
            if (type.getKey().equals(userEnteredType)) {
                userType = type.getValue();
                break;
            }
        }
        return userType;
    }

}
