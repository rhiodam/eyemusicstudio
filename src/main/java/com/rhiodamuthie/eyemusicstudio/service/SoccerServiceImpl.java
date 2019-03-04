//package com.rhiodamuthie.eyemusicstudio.service;
//
//
//import com.rhiodamuthie.eyemusicstudio.model.Player;
//import com.rhiodamuthie.eyemusicstudio.model.Team;
//import com.rhiodamuthie.eyemusicstudio.repository.PlayerRepository;
//import com.rhiodamuthie.eyemusicstudio.repository.TeamRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class SoccerServiceImpl implements SoccerService {
//
//    @Autowired
//    private PlayerRepository playerRepository;
//
//    @Autowired
//    private TeamRepository teamRepository;
//
//    public List<String> getAllTeamPlayers(long teamId) {
//        List<String> result = new ArrayList<String>();
//        List<Player> players = playerRepository.findByTeamId(teamId);
//        for (Player player : players) {
//            result.add(player.getName());
//        }
//        return result;
//    }
//    public void addBarcelonaPlayer(String name, String position, int number) {
//        Team barcelona = teamRepository.getOne(1l);
//        Player newPlayer = new Player();
//        newPlayer.setName(name);
//        newPlayer.setPosition(position);
//        newPlayer.setNum(number);
//        newPlayer.setTeam(barcelona);
//        playerRepository.save(newPlayer);
//    }
//}