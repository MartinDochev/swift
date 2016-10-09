
public class Credentials {

    final String _userName;
    static String _password;

    String[] oldPass = new String[99];
    int passIndex = 0;

    static Credentials[] user = new Credentials[199];
    static int userIndex = 0;

    public Credentials(String userName, String password) {

        _userName = userName;
        _password = password;

    }

    static void addUser(Credentials other) {
        user[userIndex] = other;
        userIndex++;
    }

    static Credentials findUser(String name) {
        int index = 0;
        for (int row = 0; row < user.length; row++) {
            if (user[row]._userName.equals(name)) {
                index = row;
                break;
            }
        }
        return user[index];
    }

    static boolean existUser(String name) {
        boolean exist = false;

        for (int row = 0; row < user.length; row++) {
            if (user[row] != null) {

                if (user[row]._userName.equals(name)) {
                    exist = true;
                    break;
                }
            }

        }

        return exist;
    }

    boolean isPassUnused(String password) {
        boolean used = false;

        for (int row = 0; row < oldPass.length; row++) {
            if (oldPass[row].equals(password)) {
                used = true;
                break;
            }
        }

        return used;
    }

    boolean checkPassword(String password) {
        boolean correct = false;

        if (_password.equals(password)) {
            correct = true;
        }

        return correct;
    }

    void savePassword(String newPass) {
        oldPass[passIndex] = newPass;
        passIndex++;
        setPassword(newPass);

        if (passIndex >= 99) {
            passIndex = 0;
        }
    }

    void setPassword(String password) {

        _password = password;

    }

    public String getUsername() {

        return _userName;

    }

    private String getPassword() {

        return _password;

    }

}
