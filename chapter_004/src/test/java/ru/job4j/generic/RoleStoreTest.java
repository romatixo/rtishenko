package ru.job4j.generic;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Рома on 07.07.2017.
 */
public class RoleStoreTest {
    @Test
    public void whenaAddTenUpdateThenDelete() {
        RoleStore roleStore = new RoleStore();
        roleStore.add(new Role("1"));
        roleStore.add(new Role("2"));
        roleStore.add(new Role("3"));
        roleStore.add(new Role("4"));
        roleStore.add(new Role("5"));
        roleStore.delete("1");
        roleStore.update(new Role("2"), "222");
        assertThat(roleStore.arr.get(0).getId(), is("222"));

    }

}