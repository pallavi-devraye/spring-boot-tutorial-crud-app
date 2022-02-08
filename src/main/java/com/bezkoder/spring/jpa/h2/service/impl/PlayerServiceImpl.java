package com.bezkoder.spring.jpa.h2.service.impl;

import com.bezkoder.spring.jpa.h2.model.Player;
import com.bezkoder.spring.jpa.h2.model.SportDepartment;
import com.bezkoder.spring.jpa.h2.repository.PlayerRepository;
import com.bezkoder.spring.jpa.h2.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public Player updatePlayer(long id, Player player) {

        Optional<Player> existingPlayer = playerRepository.findById(id);
        if (existingPlayer.isPresent()) {
            Player updatedPlayer = existingPlayer.get();
            updatedPlayer.setFirstName(player.getFirstName());
            updatedPlayer.setLastName(player.getLastName());
            updatedPlayer.setDesignation(player.getDesignation());
            updatedPlayer.setGender(player.getGender());
            updatedPlayer.setDateOfBirth(player.getDateOfBirth());
            updatedPlayer.setSportDepartment(player.getSportDepartment());
            updatedPlayer.setQualification(player.getQualification());
            updatedPlayer.setAddress(player.getAddress());
            return playerRepository.save(updatedPlayer);
        }
        return null;
    }

    @Override
    public Player getPlayer(long id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @Override
    public void deletePlayer(long id) {
        playerRepository.deleteById(id);
    }

    @Override
    public List<Player> getPlayerBySportDepartment(SportDepartment sportDept) {
        return playerRepository.findBySportDepartment(sportDept);
    }
}
