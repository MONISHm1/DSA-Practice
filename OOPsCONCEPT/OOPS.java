public class OOPS {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.print(p1.color);
        BankAccount myAcc = new BankAccount();
        myAcc.setPassword("asdad"); 
        myAcc.username = "monish";
        System.out.println(myAcc.username);
    
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword( String newPassword){
        password = newPassword;
    }

    
}