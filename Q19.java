import java.util.Scanner;

class password {
    private String password;
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(){
        if(!password.matches(".*[a-z].*") || !password.matches(".*[0-9].*")) {      //Rule:-1 must have atleast one lower case character and one digit
            return false;
        }
        if(!password.matches(".*[a-z0-9].*")) {             //rule:-2 must not have any Upper case characters and any special characters
            return false;
        }
        if(password.length()<5 || password.length()>12) {         //Rule:-3 length should be b/w 5-12
            return false;   
        }
        int n = password.length();                                  //Rule:-4 It should not have any same immediate patterns like
        for (int i = 1; i <= n / 2; i++) { // substring length
            for (int j = 0; j <= n - 2 * i; j++) {
                String first = password.substring(j, j + i);
                String second = password.substring(j + i, j + 2 * i);
                if (first.equals(second)) {
                    return false;
                }
            }
        }

        return true;
    }

}

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        password pw=new password();
        System.out.print("Enter the password: ");
        pw.setPassword(sc.nextLine());

        boolean check = pw.checkPassword();
        System.out.println("The password is " + check);
        sc.close();
    }
    
}