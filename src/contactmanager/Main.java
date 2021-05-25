/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

import java.util.Scanner;


public class Main {
        public static void main(String [] args){
      
        ContactsManager MyContactsManager = new ContactsManager();
        String name, phoneNumber,email;
      
        
        name = "Aslam";
        phoneNumber = "+6288-777-8899";
        email = "aslam@gmail.com";
        Contact contact1 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact1);

        name = "Syukur";
        phoneNumber = "+6287-566-9877";
        email = "syukur@gmail.com";
        Contact contact2 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact2);
        
        name = "Egi";
        phoneNumber = "0111-3366-5544";
        email = "egi@gmail.com";
        Contact contact3 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact3);
        
        name = "Randi";
        phoneNumber = "0333-136-1360";
        email = "randi@gmail.com";
        Contact contact4 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact4);
        
        name = "Imran";
        phoneNumber = "0123-456-7890";
        email = "imran@gmail.com";
        Contact contact5 = new Contact(name ,email, phoneNumber);
        MyContactsManager.addContact(contact5);
       
        do{
        
        Scanner input = new Scanner(System.in);
        System.out.print("Cari Nama Kontak   = ");
        name = input.nextLine();
        name = name.toLowerCase();
        
        Contact result = MyContactsManager.searchContact(name);
        if(result != null){
        System.out.println("Sedang Mencari tunggu sebentar" + "\n");
        System.out.println("Nama    :" + result.getName());
        System.out.println("Nomor   :" + result.getPhoneNumber());
        System.out.println("Email   :" + result.getEmail() + "\n");
        }
        else{
            System.out.println("\n"  + "Kontak tidak ditemukan" + "\n");
        }
        
        char yn;
        System.out.print("Again?(y/n) : ");
        yn = input.next().charAt(0);
        if(yn == 'y' || yn == 'Y'){
            
        }
        else{
            System.exit(0);
        }
        }while(true);
    }
}
