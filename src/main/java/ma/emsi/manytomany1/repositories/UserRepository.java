package ma.emsi.manytomany1.repositories;

import ma.emsi.manytomany1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findByUsername(String username);
}
