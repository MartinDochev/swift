
public class OldPasswordConflictException extends Exception {

    int index;
    String msg;

    public OldPasswordConflictException(String msg) {

        this.msg = msg;
    }

    public OldPasswordConflictException(String msg, int index) {

        this.msg = msg;
        this.index = index;
    }

    public void getPasswordConflictIndex() {

        System.out.printf("%s [Password matches a recently used one: %d]", this.msg, this.index);

    }
}
