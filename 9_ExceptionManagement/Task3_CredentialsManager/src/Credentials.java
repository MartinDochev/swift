
public class Credentials {

    private String _username;
    private String _password;

    private int _oldPasswordCount;
    private String[] _oldPasswords;

    public Credentials(String username, String password) {
        _username = username;
        _password = password;
        _oldPasswordCount = 0;
        _oldPasswords = new String[100];
    }

    public String getUsername() {
        return _username;
    }

    public boolean matchPassword(String password) {
        return _password.equals(password);
    }

    public boolean tryChangePassword(String oldPassword, String newPassword) throws OldPasswordConflictException {

        for (int i = 0; i < _oldPasswordCount; i++) {
            if (_oldPasswords[i].equals(newPassword)) {

                throw new OldPasswordConflictException("CHPASS fail", (_oldPasswordCount - i));

            } else if (_password.equals(newPassword)) {

                throw new OldPasswordConflictException("CHPASS failed", 0);
            }
        }

        _oldPasswords[_oldPasswordCount++] = _password;
        _password = newPassword;

        return true;
    }
}
