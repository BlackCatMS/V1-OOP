package Practicum07;

import java.util.Locale;

public class HoofdletterProces implements OpmaakProces{

    public HoofdletterProces() {

    }

    @Override
    public String maakOp(String input) {
        return input.toUpperCase();
    }

}
