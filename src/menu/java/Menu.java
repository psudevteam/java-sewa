package src.menu.java;

import src.helper.java.Helper;
import src.sewa.java.Sewa;

public class Menu extends Helper {
 public Menu(){
    Sewa obj = new Sewa();
    String[] list = {"Mobil", "Motor", "Keluar"};
    list(list);
    int val = inputInt("Silahkan Pilih : ");
    obj.createCredentials();
    obj.selectType(val);
 }
}
