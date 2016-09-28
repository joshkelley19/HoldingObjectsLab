package kelley.josh.HoldingObjectsLab;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by joshuakelley on 9/28/16.
 */
public class PhoneBookRefactored {
    public HashMap<String, ArrayList<String>> betterphonebook = new HashMap<String, ArrayList<String>>();

    public ArrayList<String> lookup(String name){
        for (HashMap.Entry<String,ArrayList<String>> a: betterphonebook.entrySet()) {
            if (a.getKey().equals(name)) {
                return a.getValue();
            }
        }
        return null;
    }

    public void add(String name,String number){
        if(betterphonebook.containsKey(name)){
            betterphonebook.get(name).add(number);
        }else {
            ArrayList<String> a = new ArrayList<String>();
            a.add(number);
            betterphonebook.put(name, a);
        }
    }

    public boolean remove(String name){
        if(betterphonebook.remove(name)!=null)return true;

        return false;
    }

    public boolean remove(String name,ArrayList<String> number){
        return betterphonebook.remove(name,number);
    }

    public String reverseLookup(String number){
        for(HashMap.Entry<String,ArrayList<String>> a: betterphonebook.entrySet()){
            if(a.getValue().contains(number)){
                return a.getKey();
            }
        }
        return null;
    }

    public void listAllEntries(){
        for (HashMap.Entry<String,ArrayList<String>> a: betterphonebook.entrySet()){
            System.out.print("You may reach "+a.getKey()+" at the following numbers: ");
            for (String num: a.getValue()){
                System.out.print(num+", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PhoneBookRefactored phoneBookRefactored = new PhoneBookRefactored();

        phoneBookRefactored.add("T'Challa","4439386064");
        phoneBookRefactored.add("T'Challa","123456789");
        phoneBookRefactored.add("Al Simmons","3024870098");
        phoneBookRefactored.add("Al Simmons","3024870095");
        phoneBookRefactored.add("John Stewart","2151111111");
        phoneBookRefactored.add("John Stewart","2152222222");
        phoneBookRefactored.listAllEntries();
    }
}
