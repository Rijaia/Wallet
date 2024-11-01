package org.example.wallet_test.controller;

import org.example.wallet_test.model.Wallet;
import org.example.wallet_test.repository.WalletRepository;
import org.example.wallet_test.service.WalletService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/v1")
public class WalletController {
    private Wallet wallet;
    private WalletRepository walletRepository;
    private WalletService walletService;

    @PostMapping("/wallet")
    public void createWallet(@RequestBody Wallet wallet) {
        walletRepository.addWallet(wallet);
    }
    // Пополнить кошелька//
    @PutMapping("deposit/{id}/{amount}")
    public  void depositWallet(@PathVariable Long id,
                               @PathVariable Long amount) {
        if (amount <= wallet.getAmount()) {
            walletService.deposit(id, amount);
        }
    }

    //Снять деньги с кошелька//
    @PutMapping("withdraw/{id}/{amount}")
    public void withdrawWallet(@PathVariable Long id,
                               @PathVariable Long amount) {
        if (amount <= wallet.getAmount()) {
            if (amount <= wallet.getBalance(id)) {
                walletService.withdraw(id, amount);
            }
        }
    }
    // Запрос баланса кошелька//
    @GetMapping("/wallets/{WALLET_UUID}")
    public long getWallet(@PathVariable Long WALLET_UUID) {

        return wallet.getBalance(WALLET_UUID);
    }
}
