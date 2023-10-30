package br.com.apitestsjunit5mockito.api.config;

import br.com.apitestsjunit5mockito.api.domain.User;
import br.com.apitestsjunit5mockito.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "D3n15", "d3n15@mail.com", "123");
        User u2 = new User(null, "Denis", "denis@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
