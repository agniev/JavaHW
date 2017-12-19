package exceptions;

import java.util.Scanner;

public class PinValidator {

    Scanner in;
    private int failedAttemptsNumber = 0;
    private long lastAtemptTime;
    long remainedTime;

    public PinValidator(Scanner in) {
        this.in = in;
    }

    public boolean isPinCorrect(int pin) {
        if (pin == 1234) {
            failedAttemptsNumber = 0;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkAccountAvailability() {
        if (isEnterAvailable()) {
            int enteredPin = in.nextInt();
            if (isPinCorrect(enteredPin)) {
                return true;
            } else {
                failedAttemptsNumber += 1;
                lastAtemptTime = System.currentTimeMillis();
                throw new IllegalArgumentException("Invalid pin");
            }
        } else {
            Thread thread = new Thread(() -> {

            });
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new IllegalArgumentException("Pin may be reentered in " +
                    String.valueOf(remainedTime / 1000) + " seconds");
        }
    }

    private boolean isEnterAvailable() {
        if (failedAttemptsNumber < 3) return true;
        remainedTime = lastAtemptTime + 5 * 1000 - System.currentTimeMillis();
        if (remainedTime <= 0) {
            failedAttemptsNumber = 0;
            return true;
        } else {
            return false;
        }
    }
}
