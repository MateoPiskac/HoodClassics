package hoodclassics.opp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hoodclassics.opp.domain.CustomUser;

import java.util.Optional;

public interface UserRepository extends JpaRepository<CustomUser, Long> {

    Optional<CustomUser> findByUsername(String username);
}
