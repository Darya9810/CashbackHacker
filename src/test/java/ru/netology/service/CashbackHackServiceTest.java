package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    private Assertions Assert;

    @Test
    public void shouldReturnNull() {
        int actual = service.remain(1000);
        int expected = 1000;
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn200() {
        int actual = service.remain(800);
        int expected = 200;
        Assert.assertEquals(actual, expected);
    }
}
