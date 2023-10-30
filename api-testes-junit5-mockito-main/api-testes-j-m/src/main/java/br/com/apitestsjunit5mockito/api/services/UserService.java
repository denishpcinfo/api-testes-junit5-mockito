package br.com.apitestsjunit5mockito.api.services;

import br.com.apitestsjunit5mockito.api.domain.User;
import br.com.apitestsjunit5mockito.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
    User update(UserDTO obj);
    void delete(Integer id);
}
