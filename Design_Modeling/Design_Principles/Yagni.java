package Design_Principles;

public class Yagni {
    public void login(String name, String pass){
        System.out.println("Login successful for user: "+name);
    }
    //--> violets Yagni principle as these methods are not in used -->

    // public void otpLogin(String phone){
    //     System.out.println("OTP sent to phone: "+phone);
    // }
    // public void faceLogin(){
    //     System.out.println("Face login successful");
    // }

    public static void main(String[] args){
        Yagni yg = new Yagni();
        yg.login("aman", "1234");
    }

}
