package src.kendaraan.java;

public abstract class Kendaraan {
    private String type, brand, cc;
    private float price;

    public Kendaraan(String newType, String newBrand, String newCc, float newPrice ) {
        setType(newType);
        setBrand(newBrand);
        setCc(newCc);
        setPrice(newPrice);
    }

    public Kendaraan(){}

    public void setType(String val){
        this.type = val;
    }

    public void setBrand(String val){
        this.brand = val;
    }

    public void setCc(String val){
        this.cc = val;
    }

    public void setPrice(float val){
        this.price = val;
    }

    public String getType(){
        return this.type;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getCc(){
        return this.cc;
    }

    public float getPrice(){
        return this.price;
    }

    public String info(){
        return "Tipe : " + this.getType() + "\n" + "Merek : " + this.getBrand() + "CC Mesin : " + this.getCc() + "Harga : " + this.getPrice();
    }
}