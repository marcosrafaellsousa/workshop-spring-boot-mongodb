package com.github.marcosrafaellsousa.workshopmongo.services;

import com.github.marcosrafaellsousa.workshopmongo.domain.User;
import com.github.marcosrafaellsousa.workshopmongo.dto.UserDTO;
import com.github.marcosrafaellsousa.workshopmongo.repository.UserRepository;
import com.github.marcosrafaellsousa.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById (String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete (String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User update (User user) {
        User novoUser = findById(user.getId());
        updateData(novoUser, user);
        return repo.save(novoUser);
    }

    private void updateData(User novoUser, User user) {
        novoUser.setName(user.getName());
        novoUser.setEmail(user.getEmail());
    }

    public User fromDTO (UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }

}
