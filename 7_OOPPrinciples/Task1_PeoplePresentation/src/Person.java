
import java.util.regex.Pattern;

public class Person {

    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {

        this.setFirstName(firstName);
        this.setLastName(lastName);

    }

    void setFirstName(String firstN) {

        if (firstN.length() < 2 || firstN.length() > 30) {

            System.out.println("Expected length for <parameter> is between 2 and 30 symbols.");
        }

        Pattern patt = Pattern.compile("[a-zA-Z]+");

        if (!patt.matcher(firstN).matches()) {

            System.out.println("Expected only Latin letters in firstName.");
        }

        if (!Character.isUpperCase(firstN.codePointAt(0))) {

            System.out.println("Expected upper case letter at first position of firstName.");
        } else {

            this.firstName = firstN;

        }

    }

    String getFirstName() {

        return this.firstName;

    }

    void setLastName(String lastN) {

        if (lastN.length() < 2 || lastN.length() > 30) {

            System.out.println("Expected length for <parameter> is between 2 and 30 symbols.");
        }

        Pattern patt = Pattern.compile("[a-zA-Z]+");

        if (!patt.matcher(lastN).matches()) {

            System.out.println("Expected only Latin letters in lastName.");
        }

        if (!Character.isUpperCase(lastN.codePointAt(0))) {

            System.out.println("Expected upper case letter at first position of lastName.");
        } else {

            this.lastName = lastN;

        }

    }

    String getLastName() {

        return this.lastName;
    }
}
