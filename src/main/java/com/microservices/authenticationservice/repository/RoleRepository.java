package com.microservices.authenticationservice.repository;

import java.util.Optional;

import com.microservices.authenticationservice.models.ERole;
import com.microservices.authenticationservice.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
