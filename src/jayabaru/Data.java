/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jayabaru;

public class Data extends Jayabaru {

    private String Merk;
    private int Size;
    private String Warna;
    private String KategoriSepatu;
    private double Harga;
    
    public String getMerk(){
        return this.Merk;
    }
    public void setMerk (String Mrk){
        this.Merk = Mrk;
    }
    public int getSize () {
        return this.Size;
    } 
    public void setSize (int Sz){
        this.Size= Sz;
    }
    public String getWarna (){
        return this.Warna; 
    }
    public void setWarna (String Wrn){
        this.Warna = Wrn;
    }
    public String getJenisSepatu (){
        return this.KategoriSepatu; 
    }
    public void setJenisSepatu (String js){
        this.KategoriSepatu =   js;
    }
    public String getKategoriSepatu (){
        return this.KategoriSepatu; 
    }
    public void setKategoriSepatu (String Ks){
        this.KategoriSepatu =   Ks;
    }
    public double getHarga (){
        return this.Harga; 
    }
    public void setHarga ( double hrg){
        this.Harga = hrg;
    }
}
