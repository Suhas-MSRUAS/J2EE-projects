package com.js.ac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	
	int no_of_players;
	
	String teamName;
	
	int jerseyNo;
	@Value(value = "11")
	public void setNo_of_players(int no_of_players) {
		this.no_of_players = no_of_players;
	}
	@Value(value = "Maven's")
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Value(value = "7")
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}

		


	
}
