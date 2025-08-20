class DefenceRunner{

public static void main(String []args){
	
Army army= new Army();
army.name="indian army";
army.country="india";
army.fundedYear=1895;
army.activePersonnel=12000;
army.headquatersLocation="India";
army.isActive=true;


Squad squad = new Squad();
squad.name="Alpha Squad";
squad.squadId=101;
squad.noOfMembers=12;
squad. assignedMission="sector 7";
squad. type="Forces";


army.squad = squad;

Defence defence = new Defence();

defence. name="Missile";
defence. type="Drone";
defence. range=290;
defence. manufacturer="DRDO";
defence. country="India";
defence.isInService=true;


defence.army = army;

defence.getDefenceInfo();


}
}
