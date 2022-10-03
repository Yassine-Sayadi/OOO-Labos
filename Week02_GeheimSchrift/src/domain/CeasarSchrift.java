package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CeasarSchrift implements Encoder{
    private int ceasarcijfer;
    private List<String> alphabet = new ArrayList<>(List.of("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
    private List<String> encodedAlphabet;

    public CeasarSchrift(int ceasarcijfer){
        setCeasarCijfer(ceasarcijfer);
        setEncodedAplhabet(ceasarcijfer);
    }

    private void setCeasarCijfer(int ceasarcijfer){
        if(ceasarcijfer <= 0 || ceasarcijfer >= 26) throw new IllegalArgumentException();
        this.ceasarcijfer = ceasarcijfer;
    }

    private void setEncodedAplhabet(int ceasarcijfer) {
        List<String> encodedAlphabet = this.alphabet.subList(ceasarcijfer,alphabet.size());
        List<String> secondHalf = this.alphabet.subList(0,ceasarcijfer);
        encodedAlphabet.addAll(secondHalf);
        this.encodedAlphabet = encodedAlphabet;
    }

    @Override
    public String encode(String message) {
        String secret = "";
        for(int i = 0; i < message.length(); i++){
         if(!String.valueOf(message.charAt(i)).equals(" ")){
             int index = alphabet.indexOf(String.valueOf(message.charAt(i)));
             secret += encodedAlphabet.get(index);
         }else secret += String.valueOf(message.charAt(i));
        }
        return secret;
    }

    @Override
    public String decode(String secret) {
        String message = "";
        for(int i = 0; i < secret.length(); i++){
            if(!String.valueOf(secret.charAt(i)).equals(" ")){
                int index = encodedAlphabet.indexOf(String.valueOf(secret.charAt(i)));
                message += alphabet.get(index);
            }else message += String.valueOf(secret.charAt(i));
        }
        return message;
    }
}
