package com.tubes.oop.Models;

import com.tubes.oop.menu.Barang;

public class Customer {

    private     String   customerID;
    private     String  name;
    private     String  email;
    private     String  address;
    private     String  phoneNumber;
    private     String  gender;
    private     String   birthdayDate;
    private     String  username;
    private     String  password;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void RegisterResponse() {
        System.out.println("\n{\nmessage: Successfully Register,");
        System.out.println("Data:" + "{" + "\n" +
                "\tID : " + getCustomerID() + ",\n" +
                "\tName : " + getName() + ",\n" +
                "\tEmail : " + getEmail() + ",\n" +
                "\tAddress : " + getAddress() + ",\n" +
                "\tPhone Number : " + getPhoneNumber() + ",\n" +
                "\tGender : " + getGender() + ",\n" +
                "\tBirth Date : " + getBirthdayDate() + ",\n" +
                "\tUsername : " + getUsername() + ",\n" +
                "\t},"
        );
        System.out.println("}");
    }
    public void masuk () {
        System.out.println("\n{\nmessage: Successfully Login,");
    }

    public void pilihanMenu(){
        System.out.println("selamat datang di BeliHolic :)"  + "\n" +
                "\tA. keranjang" + ",\n" +
                "\tB. Menampilkan Pesanan" +",\n" +
                "\tC. Memilih barang" +  ",\n" +
                "\tD. Melihat barang" + ",\n" +
                "\tE. Mencari kategori" + ",\n" +
                "\tF. Ulasan " + ",\n"
        );
    }


}
