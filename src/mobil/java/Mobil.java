package src.mobil.java;

import src.kendaraan.java.Kendaraan;

public class Mobil extends Kendaraan {
    private String name, driver;

    public Mobil(String newName, String newDriver, String newCC, String newBrand, float newPrice){
        super("Mobil", newBrand, newCC, newPrice);
        setName(newName);
        setDriver(newDriver);
    }

    public Mobil(){
        super("Mobil", "", "", 0);
    }

    public void setName(String val){
        this.name = val;
    }

    public void setDriver(String val){
        this.driver = val;
    }

    public String getName(){
        return this.name;
    }

    public String getDriver(){
        return this.driver;
    }

    public String info(){
        return "Nama Mobil : " + this.getName() + "\n" + "Nama Supir : " + this.getDriver() + "\n" + "Tipe : " + this.getType() + "\n" + "Merek : " + this.getBrand() + "\n" + "CC Mesin : " + this.getCc() + "\n" + "Harga : Rp." + this.getPrice();
    }

    public String toString(){
      return this.getBrand() + " " + this.getName() + " " + "Dengan Supir " + this.getDriver();
    }


}
