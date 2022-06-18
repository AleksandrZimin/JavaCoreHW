package Task2;

public class main {
    public static void main(String[] args) {
        PhoneBook phoneTableClass = new PhoneBook();
        phoneTableClass.add("+74951351313","asd");
        phoneTableClass.add("+74953566422","asd");
        phoneTableClass.add("+79991183789","asd");
        phoneTableClass.add("+79858092559","vbn");
        phoneTableClass.add("+79262547986","gft");
        phoneTableClass.add("+74994446232","wer");
        phoneTableClass.add("+79067752214","sdf");

        System.out.println(phoneTableClass.getPhoneByFIO("asd"));
        System.out.println(phoneTableClass.getPhoneByFIO("999"));
    }
}
