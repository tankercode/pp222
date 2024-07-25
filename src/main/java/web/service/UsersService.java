package web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.User;
import web.repository.UsersRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UsersService {

    private final UsersRepository usersRepository;

    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public User findOne(int id) {
        return usersRepository.findById(id).orElse(null);
    }

    public void save(User user) {
        usersRepository.save(user);
    }

    public void update(int id, User tmp) {
        tmp.setId(id);
        usersRepository.save(tmp);
    }

    public void deleteUserById(int id) {
        usersRepository.deleteById(id);
    }
}
