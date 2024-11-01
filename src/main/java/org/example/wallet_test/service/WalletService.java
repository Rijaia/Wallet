package org.example.wallet_test.service;

import org.example.wallet_test.model.OperationType;
import org.example.wallet_test.model.Wallet;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private Wallet wallet;

    public void createWallet(Wallet wallet) {
        // добавить новый кошелек в базу данных//
        wallet.setId(wallet.getId());
        wallet.setBalance(wallet.getBalance(wallet.getId()));
        wallet.setOperationType(wallet.getOperationType(wallet.getId()));

    }

    public long getBalance(long id) {
        // узнать баланс//
        return wallet.getBalance(id);
    }

    public void deposit(long id, long money) {
        // положить деньги в кошелек//
        wallet.setBalance(wallet.getBalance(id)+money);
    }

    public void withdraw(long id, long money) {
        // снять деньги из кошелька//
        if (wallet.getBalance(id) > money) {
            wallet.setBalance(wallet.getBalance(id)-money);
        }

    }
}
