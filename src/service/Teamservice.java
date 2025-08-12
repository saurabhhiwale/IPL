package service;

import entity.Team;
import repository.Teamrepository;

public class Teamservice {

	public void printTeamDetails() {
		Team team=Teamrepository.getMITeamDetails();
		
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.isQualified());
		System.out.println(team.getnRR());
	}
}
