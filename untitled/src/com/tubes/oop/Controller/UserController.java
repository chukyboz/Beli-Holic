package com.tubes.oop.Controller;

import com.tubes.oop.Models.Customer;
import com.tubes.oop.menu.Barang;

import java.util.Scanner;
import java.util.UUID;
public class UserController {
    // Call Customer class from Models Package
    Customer customer;
    Scanner sc = new Scanner(System.in);

    Barang barang;



    public void Register(Customer c) {
        // ID
        UUID customerID = UUID.fromString(String.valueOf(UUID.randomUUID()));
        c.setCustomerID(String.valueOf(customerID));
        // Name
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        c.setName(name);
        // Email
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        c.setEmail(email);

        // Address
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        c.setAddress(address);
        // phone number
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        c.setPhoneNumber(phoneNumber);
        // gender
        System.out.print("Enter Gender: ");
        String gender = sc.nextLine();
        c.setGender(gender);

        // birthdate
        System.out.print("Enter birthdate: ");
        String birthdate = sc.nextLine();
        c.setBirthdayDate(birthdate);
        // username
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        c.setUsername(username);
        // password
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        c.setPassword(password);

        c.RegisterResponse();
    }
    public void Log_in(Customer c) {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        c.setUsername(username);

        // password
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        c.setPassword(password);

        c.masuk();
    }

    public void keranjang (Barang b){

    }
    public void TampilanPesanan(Barang b){
        System.out.println("--------------------");
        System.out.println("ID Barang: " + b.getId_barang());
        System.out.println("Name barang: " + b.getNama_barang());
        System.out.println("harga: " + b.getHarga_satuan());
        System.out.println("--------------------");
    }
    public void pilihBarang(Barang b){
        // Nama barang
        System.out.println("masukan Nama Barang: ");
        String NamaBarang = sc.nextLine();
        b.setNama_barang(NamaBarang);
    }
    public void TampilanBarang(Barang b){
        System.out.println("ID Barang: " + b.getId_barang());
        System.out.println("Name: " + b.getNama_barang());
        System.out.println("harga: " + b.getHarga_satuan());
        System.out.println("quantitas: " + b.getStock());
        System.out.println("");
    }
    public void Mencarikategori(Barang b){

    }
    public void Ulasan(Barang b){

    }
}
