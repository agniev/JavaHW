package exceptions;

public class TerminalImpl implements Terminal {
    private final TerminalServer server;
    private final PinValidator pinValidator;

    public TerminalImpl(TerminalServer server, PinValidator pinValidator) {
        this.server = server;
        this.pinValidator = pinValidator;
    }

    @Override
    public boolean initWithPin() {
        try{
            pinValidator.checkAccountAvailability();
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public void requestBalance() {
        try {
            System.out.print("Your requested balance:");
            double balance = server.getBalance();
            System.out.println("\t" + balance);
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
    }

    @Override
    public void putMoney(double amount) {
        try {
            checkAmountForCorrectness(amount);
            server.addMoney(amount);
        } catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }
    }

    @Override
    public void getMoney(double amount) {
        try {
            checkAmountForCorrectness(amount);
            server.takeMoney(amount);
        } catch (Throwable throwable){
            System.out.println(throwable.getMessage());
        }
    }

    private void checkAmountForCorrectness(double amount) {
        while (amount % 100 != 0) {
            throw new IllegalArgumentException("Amount must be a multiple of 100");
        }
    }
}