package com.onndoo.projectTomee.soap;

import jakarta.ejb.Stateless;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@Stateless
@WebService
public class ScoreService {

	public static Score score = new Score();
	
	@WebMethod(operationName = "getTheScore")
	public Score getScore() {
		return score;
	}
	
	public Score updateScore(int w, int l, int t) {
		score.wins = w;
		score.ties = t;
		score.losses = l;
		return score;
	}
}
