package homework_3.task_3;

import java.util.ArrayList;
import java.util.List;

public class admission {
    private final List<User> users = new ArrayList<>();
    public void logoutNonAdminUsers() {
        for (User user : users) {
            if (!user.isAdmin()) {
                user.logout();
            }
        }
    }
}
