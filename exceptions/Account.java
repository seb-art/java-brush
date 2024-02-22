package exceptions;

import java.io.IOException;

public class Account {

    public void deposit(float value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

    }

}
