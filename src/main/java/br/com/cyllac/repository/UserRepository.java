package br.com.cyllac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cyllac.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);
}
