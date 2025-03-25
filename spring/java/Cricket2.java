package com.js.ac;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
public class Cricket2 {



	

	@Component
	public class Cricket {
		
		int no_of_players;
		
		String teamName;
		
		int jerseyNo;

		public Cricket(@Value(value = "20") int no_of_players,@Value(value="Ace") String teamName, @Value(value="5")int jerseyNo) {
			
			this.no_of_players = no_of_players;
			this.teamName = teamName;
			this.jerseyNo = jerseyNo;
		}
		

			


		
	}

}
