package com.pluralsight;

import java.util.Scanner;

public class UserInterface {


private Dealership dealership;


    private void init(){

        DealershipFileManager manager = new DealershipFileManager();
        this.dealership = manager.getDealership();

    }

    public void display(){
        init();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("\n======= DEALERSHIP MENU=======");
            



        }
    }




}
