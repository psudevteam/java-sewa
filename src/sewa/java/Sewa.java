package src.sewa.java;

import java.util.ArrayList;
import src.mobil.java.Mobil;
import src.motor.java.Motor;
import src.helper.java.Helper;

public class Sewa extends Helper {
  private ArrayList <Mobil> mobil = new ArrayList<Mobil>();
  private ArrayList <Motor> motor = new ArrayList<Motor>();
  private ArrayList <String> cust = new ArrayList<String>();
  private String name, nik, phone;
  private boolean isInserted;  

  public Sewa(){
    Mobil carData1 = new Mobil("Ayla", "Jajang Beneviento", "4000", "Honda", 400000);
    Mobil carData2 = new Mobil("Avanza", "Endang Heisenberg", "3000", "Toyota", 360000);
    mobil.add(carData1);
    mobil.add(carData2);
  }

  public void createCredentials() {
    if (this.isInserted == false){
      String newName = inputStr("Masukkan Nama Anda  : ");
      this.name = newName;
      String newNik = inputStr("Masukkan NIK Anda : ");
      this.nik = newNik;
      String newPhone = inputStr("Masukkan Nomor Telepon Anda : ");
      this.phone = newPhone;
      this.isInserted = true;
    } else {
      
    }
  }

  public void selectType(int value) {
    int val = value;
    if (val == 1) {
      Object[] o = this.mobil.toArray();
      out("Daftar Mobil yang tersedia", 1);
      list(o);
      int choice = inputInt("Silahkan Pilih : ");
      out("Anda Memilih " + this.mobil.get(choice - 1), 1);
      out("Mau sewa berapa lama?", 1);
      String[] hour = {"12 Jam", "24 Jam", "48 Jam", "72 Jam"};
      list(hour);
      int choice2 = inputInt("Silahkan Pilih : ");
      if(choice2 == 1){
        out("Harga yang harus anda bayar adalah Rp." + this.mobil.get(choice - 1).getPrice(), 1);
      } else if (choice2 == 2){
        out("Harga yang harus anda bayar adalah Rp." + (this.mobil.get(choice - 1).getPrice() + 60000), 1);
      } else if (choice2 == 3){
        out("Harga yang harus anda bayar adalah Rp." + (this.mobil.get(choice - 1).getPrice() + 120000), 1);
      } else if (choice2 == 4){
        out("Harga yang harus anda bayar adalah Rp." + (this.mobil.get(choice - 1).getPrice() + 160000), 1);
      } else {
      }
    } else if (val == 2) {
      Object[] o = this.motor.toArray();
      if (o.length == 0){
          out("Tidak ada Data Motor yang Tersedia", 1);
          inputStr("Tekan Enter Untuk Kembali.........");
          createCredentials();
      } else {
        out("Daftar Motor yang tersedia", 1);
        list(o);
        int choice = inputInt("Silahkan Pilih : ");
        out("Anda Memilih " + this.motor.get(choice - 1), 1);
        out("Mau sewa berapa lama?", 1);
        String[] hour = {"12 Jam", "24 Jam", "48 Jam", "72 Jam"};
        list(hour);
        int choice2 = inputInt("Silahkan Pilih : ");
        if(choice2 == 1) {
          out("Harga yang harus anda bayar adalah Rp." + this.motor.get(choice - 1).getPrice(), 1);
        } else if (choice2 == 2){
          out("Harga yang harus anda bayar adalah Rp." + (this.motor.get(choice - 1).getPrice() + 60000), 1);
        } else if (choice2 == 3){
          out("Harga yang harus anda bayar adalah Rp." + (this.motor.get(choice - 1).getPrice() + 120000), 1);
        } else if (choice2 == 4){
          out("Harga yang harus anda bayar adalah Rp." + (this.motor.get(choice - 1).getPrice() + 160000), 1);
        } else {
      }
    }
   }
  }
}
