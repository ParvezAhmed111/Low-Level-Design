package designPatterns.creationalDesignPatterns.d_builderDP;

public class Main {
    public static void main(String[] args) {
        User user1= new User.UserBuilder()
                .setUserId("USER123")
                .setEmailId("parvez@gmail.com")
                .setUserName("Parvez")
                .build();
        System.out.println(user1);

        User user2= User.UserBuilder.builder()
                .setUserName("Parvez")
                .setUserId("USER123")
                .build();
        System.out.println(user2);
    }
}
