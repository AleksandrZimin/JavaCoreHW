package Task2;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneTableClass = new PhoneBook();
        phoneTableClass.add("+74951351313","Bob Jackson");
        phoneTableClass.add("+74953566422","Bill Tailor");
        phoneTableClass.add("+79991183789","Sandra Donovan");
        phoneTableClass.add("+79858092559","Villa Lover");
        phoneTableClass.add("+79262547986","Adam Bykov");
        phoneTableClass.add("+74994446232","Loid Frost");
        phoneTableClass.add("+79067752214","Jack Mauser");

        System.out.println(phoneTableClass.getPhoneByFIO("Adam Bykov"));
        System.out.println(phoneTableClass.getPhoneByFIO("79262547986"));
    }
}
