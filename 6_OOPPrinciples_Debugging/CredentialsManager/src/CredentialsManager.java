
import java.util.Scanner;

public class CredentialsManager {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] inputSplit;
        inputSplit = input.split(" ");
        String command = inputSplit[0];
        String name = inputSplit[1];
        String password = inputSplit[2];
        String newPass = null;

        while (!command.equals("END")) {

            switch (command) {

                case "ENROLL":
                    if (!Credentials.existUser(name)) {
                        Credentials user = new Credentials(name, password);
                        Credentials.addUser(user);
                        user.savePassword(password);
                        System.out.println("ENROLL success");
                        break;
                    } else {
                        System.out.println("ENROLL fail");
                        break;
                    }
                case "CHPASS":
                    if (!Credentials.existUser(name)) {
                        if ((Credentials.findUser(name).checkPassword(password))
                                && (!Credentials.findUser(name).isPassUnused(newPass))) {
                            Credentials.findUser(name).setPassword(newPass);
                            Credentials.findUser(name).savePassword(newPass);
                            System.out.println("CHPASS success");
                            break;
                        } else {
                            System.out.println("CHPASS fail");
                            break;

                        }

                    } else {
                        System.out.println("CHPASS fail");
                        break;
                    }
                case "AUTH":
                    if (Credentials.existUser(name)) {
                        if (Credentials.findUser(name).checkPassword(password)) {
                            System.out.println("AUTH success");
                            break;
                        } else {
                            System.out.println("AUTH fail");
                            break;
                        }
                    } else {
                        System.out.println("AUTH fail");
                        break;
                    }
                default:
                    System.out.println("Unexist command");
                    break;
            }
            input = scan.nextLine();
            inputSplit = input.split(" ");
            switch (inputSplit.length) {
                case 4:
                    command = inputSplit[0];
                    name = inputSplit[1];
                    password = inputSplit[2];
                    newPass = inputSplit[3];
                    break;
                case 3:
                    command = inputSplit[0];
                    name = inputSplit[1];
                    password = inputSplit[2];
                    break;
                case 1:
                    command = inputSplit[0];
                    break;
                default:
                    break;
            }
        }
    }
}
