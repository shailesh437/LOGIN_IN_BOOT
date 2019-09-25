package com.shailesh.springboot.LOGIN_IN_BOOT.repository;

import com.shailesh.springboot.LOGIN_IN_BOOT.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role);

}
