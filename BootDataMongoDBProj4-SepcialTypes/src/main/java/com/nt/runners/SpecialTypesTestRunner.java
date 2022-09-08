package com.nt.runners;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.PlayerInfo;
import com.nt.service.IPlayerMgmtService;

@Component
public class SpecialTypesTestRunner implements CommandLineRunner {
	@Autowired
	private IPlayerMgmtService  service;

	@Override
	public void run(String... args) throws Exception {
		PlayerInfo info=new PlayerInfo();
		info.setPid(new Random().nextInt(10000));
		info.setPname("jadeja"); info.setPaddrs("jaipur"); info.setNickNames(List.of("jaddu","jadu","sir"));
		info.setFriends(new String[] {"dhoni","ashwin","raina","kohli"});
		info.setImpKnocks(Map.of("asia cup","35 runs","2019 world cup semi-final","60+ runs"));
		info.setContactNumbers(Set.of(9999999L,8888888L,7777777L));
		Properties props=new Properties();
		props.put("aadhar","999999L123");
		props.put("panCard","888888L5455");
		info.setIdDetails(props);
		
		System.out.println(service.registerPlayer(info));
		
		

	}

}
