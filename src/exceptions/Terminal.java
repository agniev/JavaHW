package exceptions;

public interface Terminal {

    boolean initWithPin();

    void requestBalance();

    void putMoney(double amount);

    void getMoney(double amount);
}
