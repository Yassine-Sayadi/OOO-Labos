package domain;

public class Spiegeling implements Encoder{
    @Override
    public String encode(String message) {
        if(message.length() == 1) return message;
        else{
            return message.charAt(message.length() - 1) + encode(message.substring(0,message.length() - 1));
        }
    }

    @Override
    public String decode(String secret) {
        return this.encode(secret);
    }
}
