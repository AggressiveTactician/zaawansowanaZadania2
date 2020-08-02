package zad1;

public enum Dzialania {
    DODAWANIE("+"),
    ODEJMOWANIE("-"),
    MNOŻENIE("*"),
    DZIELENIE("/");

    private final String sign;

    Dzialania(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}