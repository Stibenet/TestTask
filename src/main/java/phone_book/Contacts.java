package phone_book;

import java.util.*;

/**
 * Created by 777 on 17.01.2019.
 */
public class Contacts {

    private String fio;
    private int number;
    private static Map<String, Integer> allContacts;

    //Constructor
    public Contacts(String fio, int number) {

        allContacts.put(fio, number);
        Set<Map.Entry<String, Integer>> set = allContacts.entrySet();

        // Отобразим набор
        for (Map.Entry<String, Integer> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
    public void show(){
        System.out.println(allContacts.get("Иванов"));
    }
/*
       if (allContacts == null){
            allContacts = new HashMap<>();
        }

        this.fio = fio;
        this.number = number;

        if (!hasUser()){
            System.out.println("Такого ФИО нет");
        }*/
    //}


    @Override
    public String toString() {
        return "Contacts{" +
                "fio='" + fio + '\'' +
                ", number=" + number +
                '}';
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//
//        Contacts contacts = (Contacts) obj;
//        return Objects.equals(fio, contacts.fio) &&
//                number == contacts.number;
//    }
//
//    @Override
//    public int hashCode() {
//
//        return Objects.hash(fio, number);
//    }

/*    private boolean hasUser(){
        for (Integer contacts : allContacts.values()){
            if (contacts.equals(this) && contacts.hashCode() == this.hashCode()){
                return true;
            }
        }
        return false;
    }*/


/*
    public static ArrayList getAllContacts(){
        return new ArrayList<>(allContacts.values());
    }*/
}
