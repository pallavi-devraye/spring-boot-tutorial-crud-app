package com.bezkoder.spring.jpa.h2.service;

import com.bezkoder.spring.jpa.h2.model.Player;
import com.bezkoder.spring.jpa.h2.model.SportDepartment;

import java.util.List;

public interface PlayerService {
    Player addPlayer(Player player);

    Player updatePlayer(long id, Player player);

    Player getPlayer(long id);

    List<Player> getAllPlayers();

    void deletePlayer(long id);

    List<Player> getPlayerBySportDepartment(SportDepartment sportDept);
}
