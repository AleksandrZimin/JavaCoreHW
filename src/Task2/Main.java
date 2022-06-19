package Task2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("+74951351313","Bob Jackson");
        phoneBook.add("+74953566422","Bill Tailor");
        phoneBook.add("+79991183789","Sandra Donovan");
        phoneBook.add("+79858092559","Villa Lover");
        phoneBook.add("+79262547986","Adam Bykov");
        phoneBook.add("+74994446232","Loid Frost");
        phoneBook.add("+79067752214","Jack Mauser");

        System.out.println(phoneBook.getPhoneByName("Adam Bykov"));
        System.out.println(phoneBook.getPhoneByName("79262547986"));
    }
}