class KarateRunner{

public static void main(String paper[]){
	
System.out.println("main started");


Karate karate = new Karate();





karate.karateId=1;
karate.karateBeltColor="whiteRank";
karate.karateGi="Size";
karate.punchType="JabAccuracy";
karate.kickType="Roundhouse";
 karate.kataName="Goju-Ryu";
karate.karateStyleName="Wado-Ryu";
karate.beltExam="online";
karate.competition= "Position";
karate.studentName="sahana"; 
karate.studenAge=23;
karate.studentGender="female";
karate.attendance=true;
karate.trainingHours="Morning";
karate.injuryRecord="During sparring";	
karate.karateWeapon="Nunchaku";
 karate.meditationTime="morning";
karate.karateCompetition="National";


karate.getKarateInfo();

System.out.println("main ended");



}

}



