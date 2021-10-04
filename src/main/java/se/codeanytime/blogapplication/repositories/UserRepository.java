package se.codeanytime.blogapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import se.codeanytime.blogapplication.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    void deleteUserById(Long id);
}
