package repository;

import entity.Team;

public class Teamrepository {
	
	public static Team getMITeamDetails() {
		Team team=new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setShortName("MI");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhane");
		team.setQualified(false);
		team.setnRR(-0.3f);
		return team;
	} 
	
	//Add Similar Methods for remaining 9 teams!!
	public static Team getCSKTeamDetails() {
		Team team=new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setShortName("CSK");
		team.setCaptainName("MS Dhoni");
		team.setCoachName("Stephan Flemings");
		team.setQualified(false);
		team.setnRR(0.3f);
		return team;
	} 
	
	public static Team getPBKSTeamDetails() {
		Team team=new Team();
		team.setId(103);
		team.setTeamName("Punjab Kings");
		team.setShortName("PBKS");
		team.setCaptainName("Shreyash Iyer");
		team.setCoachName("Ricky Ponting");
		team.setQualified(true);
		team.setnRR(2.1f);
		return team;
	} 
	
	public static Team getKKRTeamDetails() {
		Team team=new Team();
		team.setId(104);
		team.setTeamName("Kolkata Knight Riders");
		team.setShortName("KKR");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(true);
		team.setnRR(0.54f);
		return team;
	} 
	
	public static Team getGTTeamDetails() {
		Team team=new Team();
		team.setId(105);
		team.setTeamName("Gujrat Titans");
		team.setShortName("GT");
		team.setCaptainName("Shubhman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(true);
		team.setnRR(1.3f);
		return team;
	} 
	
	public static Team getDCTeamDetails() {
		Team team=new Team();
		team.setId(106);
		team.setTeamName("Delhi Capitals");
		team.setShortName("DC");
		team.setCaptainName("Axar patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(-0.3f);
		return team;
	} 
	
	public static Team getRRTeamDetails() {
		Team team=new Team();
		team.setId(107);
		team.setTeamName("Rajasthan Royals");
		team.setShortName("RR");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(false);
		team.setnRR(-0.1f);
		return team;
	} 
	
	public static Team getRCBTeamDetails() {
		Team team=new Team();
		team.setId(108);
		team.setTeamName("Royal Challengers Banglore");
		team.setShortName("RCB");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(true);
		team.setnRR(2f);
		return team;
	} 
	
	public static Team getLSGTeamDetails() {
		Team team=new Team();
		team.setId(109);
		team.setTeamName("Lucknow Super Giants");
		team.setShortName("LSG");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Justin Langer");
		team.setQualified(false);
		team.setnRR(0.2f);
		return team;
	}
	
	public static Team getSRHTeamDetails() {
		Team team=new Team();
		team.setId(110);
		team.setTeamName("SunRisers Hydrabad");
		team.setShortName("SRH");
		team.setCaptainName("Pat Cummings");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(0.2f);
		return team;
	}
}
