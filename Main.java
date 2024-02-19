import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // User entry codes;
        // Importing scanner;
        Scanner input = new Scanner(System.in);

        // Detecting variables;
        String password2, password1, newPassword,  name, name1;
        int selection;

        // Sign Up;
        System.out.println("Welcome! To sign up, please enter your username: ");
        name = input.nextLine();
        System.out.println("Please enter your password: ");
        password1 = input.nextLine();
        System.out.println("Your information is saved! ");
        System.out.println("Please sign in! ");

        // Sign In;
        while (true){
            System.out.println("Enter your username: ");
            name1 = input.nextLine();
            if (!(name1.equals(name))){
                System.out.println("Invalid username. ");
                continue;
            } if (name1.equals(name)) {
                System.out.println("Enter your password: ");
                password2 = input.nextLine();
                if (!(password2.equals(password1))){
                    System.out.println("Wrong password! ");
                    System.out.println("1- Reenter your password. ");
                    System.out.println("2- Enter a new password. ");
                    selection = input.nextInt();
                    switch (selection){
                        case 1:
                            System.out.println("Reenter your password: ");
                            input.nextLine();
                            password2 = input.nextLine();
                            if (password2.equals(password1)){
                                System.out.println("Successful entry!");
                                System.out.println("Welcome " + name1);
                                break;
                            }else {
                                System.out.println("Please sign in again.");
                            }
                            continue;
                        case 2:
                            System.out.println("Decide a new password: ");
                            input.nextLine();
                            newPassword = input.nextLine();
                            if (newPassword.equals(password1)){
                                System.out.println("Your new password can not be your old password.");
                            }else {
                                System.out.println("Your new password is " + newPassword);
                                continue;
                            }
                    }
                } else if (password2.equals(password1)) {
                    System.out.println("Successful entry!");
                    System.out.println("Welcome " + name1);
                    break;
                }break;
            }
        }
    }
}
