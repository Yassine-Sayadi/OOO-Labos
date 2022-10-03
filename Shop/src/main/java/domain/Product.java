package domain;

public class Product {
    private String titel, type, id;

    public Product(String titel, String type, String id){
        if(titel == null || titel.isBlank()) throw new IllegalArgumentException();
        if(type == null || type.isBlank()) throw new IllegalArgumentException();
        if(id == null || id.isBlank()) throw new IllegalArgumentException();
        this.titel = titel;
        this.type = type;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getTitel() {
        return titel;
    }
}
