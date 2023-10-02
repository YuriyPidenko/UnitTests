package homework_3.task_3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class test_admission {
    private final UserRepository userRepository = new UserRepository();
    private User adminUser;
    private User nonAdminUser1;
    private User nonAdminUser2;

    @BeforeEach

    public void setUp() {
        adminUser = new User(true);
        nonAdminUser1 = new User();
        nonAdminUser2 = new User();
        userRepository.addUser(adminUser);
        userRepository.addUser(nonAdminUser1);
        userRepository.addUser(nonAdminUser2);
    }

    @Test

    public void testLogoutNonAdminUsers_allNonAdminUsersLoggedOut() {
        userRepository.logoutNonAdminUsers();
        Assertions.assertFalse(nonAdminUser1.isLoggedIn());
        Assertions.assertFalse(nonAdminUser2.isLoggedIn());
        Assertions.assertTrue(adminUser.isLoggedIn());
    }
}