package market;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int personCount = 0;
        int prodictCount = 0;
        Person[] personArr = new Person[200];
        Product[] productArr = new Product[500];
        String inputPerson = scan.nextLine();

        String[] inputPersonSemCol = inputPerson.split(";");
        for (int i = 0; i < inputPersonSemCol.length; i++) {
            if (inputPersonSemCol[i].contains("=")) {
                String splitByEqual[] = inputPersonSemCol[i].split("=");
                String name = splitByEqual[0].trim();
                double balance = Double.parseDouble(splitByEqual[1].trim());
                Person other = new Person(name, balance);
                personArr[i] = other;
                personCount++;
                if (balance < 0) {
                    System.out.println("Balance can\'t be negative");
                    break;
                }
                if (name.equals("")) {
                    System.out.println("Name can\'t be empty");
                    break;
                }

            }

        }

        String inputProduct = scan.nextLine();

        String[] inputItemsSemiCol = inputProduct.split(";");
        for (int i = 0; i < inputItemsSemiCol.length; i++) {
            if (inputItemsSemiCol[i].contains("=")) {
                String splitByEqual[] = inputItemsSemiCol[i].split("=");
                String name = splitByEqual[0].trim();
                double price = Double.parseDouble(splitByEqual[1].trim());
                Product other = new Product(name, price);
                productArr[i] = other;
                prodictCount++;

                if (price < 0) {
                    System.out.println("Price can\'t be negative");
                    break;
                }
                if (name.equals("")) {
                    System.out.println("Name can\'t be empty");
                    break;
                }

            }

        }
        String buyItem = scan.nextLine();
        while (!buyItem.equalsIgnoreCase("END")) {

            String[] buyArr = buyItem.split(" ");
            for (int i = 0; i < personCount; i++) {
                if (personArr[i]._name.equals(buyArr[0])) {
                    for (int j = 0; j < prodictCount; j++) {
                        if (buyArr[1].equals(productArr[j].productName)) {
                            if (personArr[i]._balance >= productArr[j].price) {

                                System.out.println(personArr[i]._name + " bought " + productArr[j].productName);
                                personArr[i].inputStore(productArr[j]);
                                personArr[i]._balance -= productArr[j].price;
                            } else {
                                System.out.println(personArr[i]._name + " Can\'t afford " + productArr[j].productName);
                            }

                        }
                    }

                }

            }

            buyItem = scan.nextLine();
        }

        for (int i = 0; i < personCount; i++) {

            if (personArr[i].equals(null)) {
                break;
            } else {
                for (int j = 0; j <= personArr[i].getStoreIndex(); j++) {
                    if ((personArr[i].store[0]).equals(null)) {
                        System.out.println(personArr[i]._name + " - Nothing bought");
                        break;
                    } else if (personArr[i].store[j].equals(null)) {
                        break;

                    } else {
                        System.out.println(personArr[i]._name + " bought " + personArr[i].store[j].productName);
                    }
                }
            }

        }
    }
}
