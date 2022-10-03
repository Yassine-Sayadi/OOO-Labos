package domain;

public interface Encoder {
    public String encode(String message);

    public String decode(String secret);
}
