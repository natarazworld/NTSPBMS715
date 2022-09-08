//PlayerMgmtServiceImpl.java
package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.IMedalRepository;
import com.nt.repository.IPlayerRepository;
import com.nt.repository.ISportRepository;

@Service("playerService")
public class PlayerMgmtServiceImpl implements IPlayerMgmtService {
	@Autowired
	private IPlayerRepository  playerRepo;
	@Autowired
	private  IMedalRepository  medalRepo;
	@Autowired
	private   ISportRepository  sportRepo;

	@Override
	public String registerPlayer(Player player) {
		
		return "Player and his/her sports,medals info got saved with id value ::"+playerRepo.save(player).getPid();
	}
	
	@Override
	public List<Player> showPlayersInfo() {
	    
		return playerRepo.findAll();
	}

}
