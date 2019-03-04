package com.rhiodamuthie.eyemusicstudio.repository;


import com.rhiodamuthie.eyemusicstudio.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByPlayers(long playerId);

}
