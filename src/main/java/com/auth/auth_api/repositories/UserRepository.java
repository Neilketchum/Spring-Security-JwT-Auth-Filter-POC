package com.auth.auth_api.repositories;


import com.auth.auth_api.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Repository
@Service
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}