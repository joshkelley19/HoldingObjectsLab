package kelley.josh.HoldingObjectsLab;

import java.util.HashMap;

/**
 * Created by joshuakelley on 9/28/16.
 */
public class PhoneBook {
    public HashMap<String, String> phonebook = new HashMap<String, String>();

    public String lookup(String name){
        if(phonebook.containsKey(name)){
            return phonebook.get(name);
        }else return null;
    }

    public void add(String name,String number){
        phonebook.put(name,number);
    }

    public boolean remove(String name){
        if(phonebook.remove(name)!=null)return true;

        return false;
    }

    public boolean remove(String name,String number){
        return phonebook.remove(name,number);
    }

    public String reverseLookup(String number){
        for(HashMap.Entry<String,String> a: phonebook.entrySet()){
            if(a.getValue().equals(number)){
                return a.getKey();
            }
        }
        return null;
    }

    public void listAllEntries(){
        for (HashMap.Entry<String,String> a: phonebook.entrySet()){
            System.out.println("You may reach "+a.getKey()+" at "+a.getValue());
        }
    }

    public static void main(String[] args) {
        PhoneBook p = new PhoneBook();
        p.add("Josh","4439386064");
        p.add("Wade Wilson","3024870098");
        p.add("Wally West","2151111111");
        p.listAllEntries();
    }
}
