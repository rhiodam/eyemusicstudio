package com.rhiodamuthie.eyemusicstudio.repository;

import com.rhiodamuthie.eyemusicstudio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Repository
//@Component
public interface UserRepository extends JpaRepository<User , Long> {

}
