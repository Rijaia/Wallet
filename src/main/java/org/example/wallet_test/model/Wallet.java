package org.example.wallet_test.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public class Wallet {
   @Id
    private Long id; //идентификатор конкретного кошелька//
    private long balance; //сумма на счету//
    private OperationType operationType; //тип доступной операции//
    private long amount;

    public Wallet(Long id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getBalance(long id) {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public OperationType getOperationType(long id) {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public long getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallet wallet = (Wallet) o;
        return balance == wallet.balance && amount == wallet.amount && Objects.equals(id, wallet.id) && operationType == wallet.operationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, operationType, amount);
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "id=" + id +
                ", balance=" + balance +
                ", operationType=" + operationType +
                ", amount=" + amount +
                '}';
    }
}
