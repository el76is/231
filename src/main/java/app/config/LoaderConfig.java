package app.config;

import app.model.User;
import app.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LoaderConfig {

    private final UserService userService;

    public LoaderConfig(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void fillDb() {
        User user1 = new User();
        user1.setFirstName("FirstName1");
        user1.setLastName("LastName1");
        user1.setEmail("user1@somewhere.net");
        userService.create(user1);

        User user2 = new User();
        user2.setFirstName("FirstName2");
        user2.setLastName("LastName2");
        user2.setEmail("user2@somewhere.net");
        userService.create(user2);

        User user3 = new User();
        user3.setFirstName("FirstName3");
        user3.setLastName("LastName3");
        user3.setEmail("user3@somewhere.net");
        userService.create(user3);
    }
}