package com.rhiodamuthie.eyemusicstudio.repository;

import com.rhiodamuthie.eyemusicstudio.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findByTeamId(long teamId);
}
