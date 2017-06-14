package ru.job4j.mapbank;

import java.util.*;

/**
 * MapBank класс для реализации коллекции Map.
 * @author romatihsenko
 * @since 1.06.2017
 * @version 1
 */
public class MapBank {
    public Map<User, List<Account>> getMap() {
        return map;
    }

    private Map<User, List<Account>> map = new HashMap<>();

    public void addUser(User user) {
        map.put(user, new ArrayList<Account>());
    }

    public void deleteUser(User user) {
        map.remove(user);
    }

    public void addAccountToUser(User user, Account account) {
        List<Account> list = map.get(user);
        if (list != null) {
            list.add(account);
        } else System.out.println("Такого пользователя нет.");
    }

    public List<Account> getUserAccounts (User user) {
        return map.get(user);
    }

    public void deleteAccountFromUser(User user, Account account) {
        List<Account> list = map.get(user);
        if (list != null) {
            list.remove(list.indexOf(account));
        } else System.out.println("Такого пользователя нет.");
    }

    public boolean transferMoney (User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        boolean result = true;
        List<Account> list = map.get(srcUser);
        for (Account account : list) {
            if (account.equals(srcAccount)) {
                if (srcAccount.getValue() - amount < 0) {
                    result = false;
                    break;
                } else {
                    list.set(list.indexOf(srcAccount), new Account(srcAccount.getValue() - amount, srcAccount.getRequisites()));
                    List<Account> dstlist = map.get(dstUser);
                    dstlist.set(dstlist.indexOf(dstAccount), new Account(dstAccount.getValue() + amount, dstAccount.getRequisites()));
                }

            }
        }
        return result;
    }
}
