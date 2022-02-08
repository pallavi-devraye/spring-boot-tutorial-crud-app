package com.bezkoder.spring.jpa.h2.repository;

import com.bezkoder.spring.jpa.h2.model.Player;
import com.bezkoder.spring.jpa.h2.model.SportDepartment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findBySportDepartment(SportDepartment sportDept);
}
