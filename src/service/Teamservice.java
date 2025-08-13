package service;
import java.util.Scanner;
import repository.Teamrepository;

public class Teamservice {
	
	public void selectOptions() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to The IPL Portal");
		System.out.println("Please select one of the following options: ");
		System.out.println("1.Get All Select details: ");
		System.out.println("2.Get Team Details by short name: ");
		System.out.println("3.Get Team Details by Team ID: ");
		
		int input=sc.nextInt();
		System.out.println("You have selected option "+input);
		
		switch (input) {
		
		//Get all Team Details
		case 1: {
			System.out.println("in case 1");
			System.out.println(Teamrepository.getMITeamDetails());
			System.out.println(Teamrepository.getCSKTeamDetails());
			System.out.println(Teamrepository.getPBKSTeamDetails());
			System.out.println(Teamrepository.getKKRTeamDetails());
			System.out.println(Teamrepository.getGTTeamDetails());
			System.out.println(Teamrepository.getDCTeamDetails());
			System.out.println(Teamrepository.getRRTeamDetails());
			System.out.println(Teamrepository.getRCBTeamDetails());
			System.out.println(Teamrepository.getLSGTeamDetails());
			System.out.println(Teamrepository.getSRHTeamDetails());
			break;
		}
		
		//Get team Details By Short Name
		case 2: {
			System.out.println("Please Enter Your fav Teams Short Name: ");
			String teamShortName=sc.next().toUpperCase();
			System.out.println("Entered Team Short name is "+teamShortName);
			getTeamByShortName(teamShortName);
			
			break;
		}
		
		//get team details by iD
		case 3:{
			System.out.println("Please enter Your fav Teams ID: ");
			int teamID=sc.nextInt();
			System.out.println("Entered Team ID is "+teamID);
			getTeamByTeamID(teamID);

			break;
		}
		
		//Default Case 
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
	
	private void getTeamByTeamID(int teamID) {
		if(teamID==101) {
			System.out.println(Teamrepository.getMITeamDetails());
		}
		else if(teamID==102) {
			System.out.println(Teamrepository.getCSKTeamDetails());
		}
		else if(teamID==103) {
			System.out.println(Teamrepository.getPBKSTeamDetails());
		}
		else if(teamID==104) {
			System.out.println(Teamrepository.getKKRTeamDetails());
		}
		else if(teamID==105) {
			System.out.println(Teamrepository.getGTTeamDetails());
		}
		else if(teamID==106) {
			System.out.println(Teamrepository.getDCTeamDetails());
		}
		else if(teamID==107) {
			System.out.println(Teamrepository.getRRTeamDetails());
		}
		else if(teamID==108) {
			System.out.println(Teamrepository.getRCBTeamDetails());
		}
		else if(teamID==109) {
			System.out.println(Teamrepository.getLSGTeamDetails());
		}
		else if(teamID==110) {
			System.out.println(Teamrepository.getSRHTeamDetails());
		}
		else {
			System.err.println("Please enter a valid Team ID !!");
		}
	}
	
	private void getTeamByShortName(String shortName) {
		
		switch (shortName) {
		case "MI": {
			
			System.out.println(Teamrepository.getMITeamDetails());
			break;
		}
		case "CSK": {
			
			System.out.println(Teamrepository.getCSKTeamDetails());
			break;
		}
		case "RR": {
			
			System.out.println(Teamrepository.getRRTeamDetails());
			break;
		}
		case "RCB": {
			
			System.out.println(Teamrepository.getRCBTeamDetails());
			break;
		}
		case "PBKS": {
			
			System.out.println(Teamrepository.getPBKSTeamDetails());
			break;
		}
		case "SRH": {
			
			System.out.println(Teamrepository.getSRHTeamDetails());
			break;
		}
		case "DC": {
			
			System.out.println(Teamrepository.getDCTeamDetails());
			break;
		}
		case "LSG": {
			
			System.out.println(Teamrepository.getLSGTeamDetails());
			break;
		}
		case "KKR": {
			
			System.out.println(Teamrepository.getKKRTeamDetails());
			break;
		}
		case "GT": {
			
			System.out.println(Teamrepository.getGTTeamDetails());
			break;
		}
		default:
			
			throw new IllegalArgumentException("Unexpected value: " + shortName);
		}
	}
}

/*
	public void printTeamDetails() {
		Team team=Teamrepository.getMITeamDetails();
		
		System.out.println(team);
		
		System.out.println(team.getId());
		System.out.println(team.getTeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.isQualified());
		System.out.println(team.getnRR());
	}
}
*/