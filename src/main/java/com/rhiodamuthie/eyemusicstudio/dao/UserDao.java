package com.rhiodamuthie.eyemusicstudio.dao;

import com.rhiodamuthie.eyemusicstudio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@Component
public interface UserDao extends JpaRepository<User , Long> {

}
