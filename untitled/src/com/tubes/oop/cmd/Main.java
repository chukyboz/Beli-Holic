package com.tubes.oop.cmd;

import com.tubes.oop.Controller.UserController;
import com.tubes.oop.Models.Customer;
import com.tubes.oop.menu.Barang;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Customer c = new Customer();
        Barang b = new Barang();
        UserController u = new UserController();
        Scanner sc = new Scanner(System.in);
        u.Register(c);
        u.Log_in(c);
        Menu(c,b,u,sc);

    }

    private static void Menu(Customer c, Barang b, UserController u, Scanner sc){
        c.pilihanMenu();

        // inputan menu
        System.out.println("masukan pilihan: ");
        String pilihan = sc.nextLine();

        // pilihan menu
        if (pilihan == "A") {
            u.keranjang(b);
        }
        else if (pilihan == "B") {
            u.TampilanPesanan(b);
        }
        else if (pilihan == "C") {
            u.pilihBarang(b);
        }
        else if (pilihan == "D") {
            u.TampilanBarang(b);
        }
        else if (pilihan == "E") {
            u.Mencarikategori(b);
        }
        else if (pilihan == "F") {
            u.Ulasan(b);
        }
    }

}
