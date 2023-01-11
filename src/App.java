public class App {
    public static void main(String[] args) throws Exception {

        User user = new User();
        Physics physics = new Physics();

        user.setName("Bruno");
        user.setAge(23);
        user.university.setCity("Maringá");
        user.university.setState("Paraná");
        user.university.setStreet("Rua 9 de Novembro");
        user.university.setCountry("Brazil");

        System.out.println("The user name is " + user.getName() + " and he has "
                + user.getAge() + " years old");
        System.out.println("His university is located at " + user.university.getStreet() + ", " +
                user.university.getCity() + ", " + user.university.getState() + ", "
                + user.university.getCountry());
        System.out.println("His favorite subject is " + physics.getName() + " and the topic "
                + physics.linearMotion.getName() + " with duration of "
                + physics.linearMotion.getDuratinMonths() + " months");

    }
}
