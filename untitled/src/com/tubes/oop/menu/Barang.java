package com.tubes.oop.menu;


import com.tubes.oop.Models.Customer;



public class Barang {
    Customer customer;
    private int id_barang, berat, stock;
    private final int pembelian_minimum = 1;
    private double harga_satuan;
    private String nama_barang, kondisi_barang, deskripsi_barang;

    public barang(int id_barang, String nama_barang, int berat, int stock,
                  double harga_satuan, String kondisi_barang, String deskripsi_barang) {
        this.id_barang = id_barang;
        this.berat = berat;
        this.stock = stock;
        this.harga_satuan = harga_satuan;
        this.nama_barang = nama_barang;
        this.kondisi_barang = kondisi_barang;
        this.deskripsi_barang = deskripsi_barang;
    }

    public int getId_barang() {
        return id_barang;
    }

    public int getBerat() {
        return berat;
    }

    public int getStock() {
        return stock;
    }

    public int getPembelian_minimum() {
        return pembelian_minimum;
    }

    public double getHarga_satuan() {
        return harga_satuan;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public String getKondisi_barang() {
        return kondisi_barang;
    }

    public String getDeskripsi_barang() {
        return deskripsi_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setHarga_satuan(double harga_satuan) {
        this.harga_satuan = harga_satuan;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setKondisi_barang(String kondisi_barang) {
        this.kondisi_barang = kondisi_barang;
    }

    public void setDeskripsi_barang(String deskripsi_barang) {
        this.deskripsi_barang = deskripsi_barang;
    }


}
