package com.megamart.userservice.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megamart.userservice.model.Credential;

@Repository
public interface CredentialRepository extends JpaRepository<Credential, Integer> {

	Optional<Credential> findByUsername(final String username);
}
