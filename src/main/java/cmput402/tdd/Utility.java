package cmput402.tdd;

import java.util.ArrayList;
import java.util.HashMap;

import cmput402.tdd.service.Search;

public class Utility {

	public HashMap<String, Float>  countAverageScore(Search search){
		
		HashMap<String, ArrayList<Integer>> results = search.returnAll();
		
		HashMap<String, Float> map = new HashMap<String, Float> ();
		
		for(String player: results.keySet()) {
			float avg = (float)results.get(player).get(1)/results.get(player).get(0);
			map.put(player,avg);
		}
		return map;
	}
	
	public HashMap<String, Integer>  findTopScorer(Search search){
		
		HashMap<String, ArrayList<Integer>> playerScore = search.returnAll();
		
		HashMap<String, Integer> map = new HashMap<String, Integer> ();
		
		int highestScore= -1;
		String name = "";
		
		for(String player: playerScore.keySet()){
			if(playerScore.get(player).get(1)>=highestScore){
				highestScore = playerScore.get(player).get(1);
				name = player;
			}
		}
		
		map.put(name, highestScore);
		
		return map;
	}
	
}
