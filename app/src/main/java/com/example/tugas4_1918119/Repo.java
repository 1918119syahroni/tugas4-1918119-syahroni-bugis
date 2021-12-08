package com.example.tugas4_1918119;

public class Repo {
    private String nama,jenis,keterangan;
    private int img;
    public Repo(String nama, String jenis, String keterangan, int img){
        this.nama = nama;
        this.jenis = jenis;
        this.keterangan = keterangan;
        this.img=img;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getJenis(){
        return jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getKeterangan(){
        return keterangan;
    }
    public void setKeterangan(String clock){
        this.keterangan = keterangan;
    }
    public void setImg(){
        this.img=img;
    }
    public int getImg(){
        return img;
    }
}
