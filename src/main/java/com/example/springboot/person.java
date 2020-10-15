package com.example.springboot;
class person{

    String first_name;
    String last_name;
    int  phone;
    String address;

    public person(){

    }
    public person(String first_name, String last_name, int phone, String address) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone = phone;
        this.address = address;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}