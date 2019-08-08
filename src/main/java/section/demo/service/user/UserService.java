package section.demo.service.user;

import section.demo.entity.User;
import section.demo.model.UserSection;

import java.util.List;

public interface UserService {
    List<UserSection> getSection(Long id_user);
    User getProfile(Long id_user);
    User addUser(User user);
    User editUser(User user, Long id);
    void deleteUser(Long id);
}
