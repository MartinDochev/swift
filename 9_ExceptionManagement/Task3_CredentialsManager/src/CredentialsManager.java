
import java.util.Scanner;

public class CredentialsManager {

    public static void main(String[] args) throws OldPasswordConflictException {

        Scanner sc = new Scanner(System.in);
        String line;

        Credentials[] credentials = new Credentials[200];
        int credentialCount = 0;

        while (!(line = sc.nextLine()).equalsIgnoreCase(("END"))) {

            String[] split = line.split(" ");
            String command = split[0];
            String target = split[1].trim();
            String targetPass = split[2].trim();

            switch (command.toUpperCase()) {
                case "ENROLL":
                    credentials[credentialCount++] = new Credentials(target, targetPass);
                    System.out.println("ENROLL success");
                    break;
                case "CHPASS":
                    for (int i = 0; i < credentialCount; i++) {

                        String source = credentials[i].getUsername();
                        if (source.equalsIgnoreCase(target)) {
                            try {
                                credentials[i].tryChangePassword(targetPass, split[3].trim());
                                System.out.println("CHPASS seccess");
                            } catch (OldPasswordConflictException ex) {
                                ex.getPasswordConflictIndex();
                            }

                            break;
                        }
                    }
                    break;

                case "AUTH":
                    for (int i = 0; i < credentialCount; i++) {
                        String source = credentials[i].getUsername();

                        if (source.equalsIgnoreCase(target)) {
                            if (credentials[i].matchPassword(targetPass)) {
                                System.out.println("AUTH success");
                            } else {
                                System.out.println("AUTH fail");
                            }

                            break;
                        }
                    }
                    break;
                default:

                    break;
            }
        }
    }
}
