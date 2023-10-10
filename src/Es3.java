public class Es3 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("mario", "555123");
        phonebook.add("francesco", "555124");
        phonebook.add("guido", "555125");
        phonebook.add("giuseppe", "555126");
        phonebook.add("maria", "555127");
        phonebook.add("giovanna", "555128");

        phonebook.remove("guido");

        System.out.println("find 555126 owner: " + phonebook.findName("555126"));
        System.out.println("find 5551267 owner: " + phonebook.findName("5551267"));

        System.out.println("find maria number: " + phonebook.findNumber("maria"));
        System.out.println("find franco number: " + phonebook.findName("franco"));
        
        phonebook.printAll();
    }
}
