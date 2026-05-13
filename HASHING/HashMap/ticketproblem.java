import java.util.*;
public class ticketproblem {
    public static String getStart(HashMap <String,String> tickets){
        HashMap <String,String> revTckt = new HashMap<>();

        for(String key : tickets.keySet()){
            revTckt.put(tickets.get(key), key);
        }
        for(String key : tickets.keySet()){
            if(!revTckt.containsKey(key)){
                return key;
            }
        }
        return null;
    }
public static void main(String[] args) {
    HashMap <String,String> tickets = new HashMap<>();
    tickets.put("chennai", "benglaluru");
    tickets.put("mumbai", "delhi");
    tickets.put("Goa", "chennai");
    tickets.put("delhi", "Goa");

  
      String start = getStart(tickets);
        System.out.print("Start: " + start);

      for(String key : tickets.keySet()){
        System.out.print("->" + tickets.get(start));
        start = tickets.get(start);
      }
      System.out.println("");
}
    
}