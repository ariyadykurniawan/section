package section.demo.service.user;

import section.demo.entity.User;
import section.demo.model.UserSection;
import section.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserSection> getSection(Long id_user) {
        return userRepository.getSection(id_user);
    }

    @Override
    public User getProfile(Long id_user){
        return userRepository.findById(id_user).get();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User editUser(User user, Long id) {
        user.setId(id);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
