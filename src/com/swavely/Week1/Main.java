// Justin Swavely 03/21/2019 This program features interfaces and implementation 
package com.swavely.Week1;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        list list = new list();
        Contact person1 = new Contact("Mark Killoran","MarkKilloran@gmail.com");
        Contact person2 = new Contact("Justin Swavely","JustinSwavely@gmail.com");
        Contact person3 = new Contact("Johnny Gilbert","JohnnyGilbert@gmail.com");
        list.add(person1,person2,person3);
        for (Contact contact : list) {
            contact.display();
        }

    }

}
class Contact{
    private String name;
    private String email;
    public Contact(String name, String email) {
        this.name = name;
        this.email = email;
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
    public void display(){
        System.out.println(name + email);
    }
}
class list implements Iterable<Contact>{
    ArrayList<Contact> contacts = new ArrayList();
    @Override
    public void forEach(Consumer<? super Contact> action) {

    }
    @Override
    public Iterator<Contact> iterator() {
        return this.contacts.iterator();
    }
    public void add(Contact person1, Contact person2, Contact person3){
        contacts.add(person1);
        contacts.add(person2);
        contacts.add(person3);
    }
}
