package src.motor.java;

import src.kendaraan.java.Kendaraan;

public class Motor extends Kendaraan {
    private String name;

    public Motor(String newName, String newCC, String newBrand, float newPrice){
        super("Motor", newBrand, newCC, newPrice);
        setName(newName);
    }

    public Motor(){
        super("Motor", "", "", 0);
    }

    public void setName(String val){
        this.name = val;
    }

    public String getName(){
        return this.name;
    }

    public String info(){
        return "Nama Motor : " + this.getName() + "\n" +  "Tipe : " + this.getType() + "\n" + "Merek : " + this.getBrand() + "\n" + "CC Mesin : " + this.getCc() + "\n" + "Harga : Rp." + this.getPrice();
    }

    public String toString(){
      return this.getBrand() + " " + this.getName();
    }


}
