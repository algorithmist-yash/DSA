public class accessModifiers {
    public static void main(String []args){
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Yash Raj";
        myAcc.accountNumber = 73020200;
        // myAcc.password = "password";    // The field BankAccount.password is not visible
        myAcc.setPassword("password");
        myAcc.setDigitalSignature("yashraj");
        System.out.println(myAcc.getDigitalSignature());
        System.out.println(myAcc.getPassword());
        
    }
}

class BankAccount{
    String userName;
    int accountNumber;

    // Access Modifieres: Private, Default, Protected, public

    private String password;
    void setPassword(String password){
        // password = password;    // The assignment to variable password has no effect.
        this.password = password;
    }
    String getPassword(){
        return password;
    }
    
    private String digitalSignature;
    void setDigitalSignature(String signature){
        this.digitalSignature = signature;
    }
    String getDigitalSignature(){
        return this.digitalSignature;
    }
}