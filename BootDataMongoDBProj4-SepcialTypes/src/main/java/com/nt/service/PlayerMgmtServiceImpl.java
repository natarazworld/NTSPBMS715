package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.PlayerInfo;
import com.nt.repository.IPlayerRepository;

@Service("playerService")
public class PlayerMgmtServiceImpl implements IPlayerMgmtService {
	@Autowired
	 private  IPlayerRepository  playerRepo;

	@Override
	public String registerPlayer(PlayerInfo info) {
			return "Player is saved with id value ::"+ playerRepo.insert(info).getPid();
}

}
