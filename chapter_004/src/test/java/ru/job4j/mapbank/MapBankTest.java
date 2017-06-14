package ru.job4j.mapbank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MapBankTest {
    public void whenAddUserThenPlusOneUser() {
        MapBank mapBank = new MapBank();
        User user = new User("Roma", "111");
        mapBank.addUser(user);
        User us = mapBank.getMap().keySet().iterator().next();
        System.out.println(us);
        System.out.println(user);
    }

    public void whenDeleteUserThenMinusOneUser() {
        MapBank mapBank = new MapBank();
        User user = new User("Roma", "111");
        User user1 = new User("Stas", "111");
        mapBank.addUser(user);
        mapBank.addUser(user1);
        mapBank.deleteUser(user);
        User us = mapBank.getMap().keySet().iterator().next();
        System.out.println(us);
        System.out.println(user1);
    }

    public void whenAddAccountThenPlusOneUser() {
        MapBank mapBank = new MapBank();
        User user = new User("Roma", "111");
        mapBank.addUser(user);
        Account account = new Account(111.111, 111000);
        mapBank.addAccountToUser(user, account);
        Account ac = mapBank.getMap().get(user).get(0);
        System.out.println(ac);
        System.out.println(account);
    }
    public void whenAddAccountforUserThenPlusOneUser() {
        MapBank mapBank = new MapBank();
        User user = new User("Roma", "111");
        mapBank.addUser(user);
        Account account = new Account(111.111, 111000);
        mapBank.addAccountToUser(user, account);
        Account account1 = new Account(111.222, 111222);
        mapBank.addAccountToUser(user, account1);
        mapBank.deleteAccountFromUser(user, account);
        Account ac = mapBank.getMap().get(user).get(0);
        System.out.println(ac);
        System.out.println(account1);
    }

    public void whengetListUSerThenPlusOneUser() {
        MapBank mapBank = new MapBank();
        User user = new User("Roma", "111");
        mapBank.addUser(user);
        Account account = new Account(111.111, 111000);
        mapBank.addAccountToUser(user, account);
        List<Account> list  = mapBank.getUserAccounts(user);


        System.out.println(list.get(0));
        List<Account> list1 = new ArrayList<Account>();
        list1.add(new Account(111.111, 111000));
        System.out.println(list1.get(0));

    }

    public void whenOneUserTransfThenPlusOneUser() {
        MapBank mapBank = new MapBank();

        User user = new User("Roma", "111");
        mapBank.addUser(user);
        Account account = new Account(111.111, 111000);
        mapBank.addAccountToUser(user, account);

        User user1 = new User("Stas", "111");
        mapBank.addUser(user1);
        Account account1 = new Account(111.222, 111222);
        mapBank.addAccountToUser(user1, account1);

        mapBank.transferMoney(user, account, user1, account1, 111.000);

        List<Account> list  = mapBank.getUserAccounts(user1);


        System.out.println(list.get(0));
        List<Account> list1 = new ArrayList<Account>();
        list1.add(new Account(0.111, 111000));
        System.out.println(list1.get(0));

    }


    public static void main(String[] args) {
        new MapBankTest().whenOneUserTransfThenPlusOneUser();
    }
}
