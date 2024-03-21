/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Total;

/**
 *
 * @author Lab Informatika
 */
public class Hitung {
    private int harga, jumlah;
    
    public Hitung(int harga, int jumlah){
    this.harga=harga;
    this.jumlah=jumlah;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setHarga(int harga){
    this.harga=harga;
    }
    
    public void setJumlah(int jumlah){
    this.jumlah=jumlah;
    }
    
    public int hargaTotal(){
    return harga*jumlah;
    }
      
}
