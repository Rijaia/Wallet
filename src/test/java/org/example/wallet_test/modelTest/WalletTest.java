package org.example.wallet_test.modelTest;

import org.example.wallet_test.model.Wallet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class WalletTest {
    Wallet wallet1 = new Wallet(1L,200);
    Wallet wallet2 = new Wallet(2L,3000);
    Wallet wallet3 = new Wallet(3L,40000);

    @Test
    public void getIdTest(){
        long expected = wallet1.getId();
        long actual = 1;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdNotNull() {
        Assert.assertNotNull(wallet2);
    }

    @Test
    public void getBalanceTest() {
        long expected = 40000;
        long actual = wallet3.getBalance(3);
        Assert.assertEquals(expected,actual);
    }


}
