package creational.singleton.a4;

public class Main {
    static void main() {
        Election election = Election.getInstance();
        User user1 = new User("A");
        User user2 = new User("B");
        User user3 = new User("C");
        User user4 = new User("D");
        user1.vote("biden");
        user1.vote("trump");
        user2.vote("trump");
        user3.vote("biden");
        user4.vote("trump");
        election.printResult();
    }
}
