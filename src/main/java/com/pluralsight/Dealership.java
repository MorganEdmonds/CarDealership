package com.pluralsight;

public class Dealership {

// This is what a dealership is made up of.

    public String name;
   public String address;
   public String phone;

//CONSTRUCTOR.
    public Dealership(String name, String address, String phone ){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

//Create getters and setters.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
