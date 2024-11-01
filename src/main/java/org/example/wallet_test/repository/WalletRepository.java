package org.example.wallet_test.repository;

import org.example.wallet_test.model.Wallet;
import org.springframework.data.repository.Repository;

public interface WalletRepository extends Repository<Wallet, Long> {
    void addWallet(Wallet wallet);
    void updateWalled(Wallet wallet);
}
