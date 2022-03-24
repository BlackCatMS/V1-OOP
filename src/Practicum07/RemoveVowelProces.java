package Practicum07;

public class RemoveVowelProces implements OpmaakProces{

    public RemoveVowelProces() {

    }

    public String maakOp(String input) {
        return input.replaceAll("[aeiouAEIOU]", "");
    }

}
