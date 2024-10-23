package com.Brioflator.User;

import org.hibernate.engine.spi.LoadQueryInfluencers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserEmail(String email);

}
