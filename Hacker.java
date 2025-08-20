class Hacker {
	
    static String alias ;
    static String skillLevel;
    static String target;
    static  boolean isEthical;
    static String knownFor;

    static String getAlias() { return alias; }
    static String getSkillLevel() { return skillLevel; }
    static String getTarget() { return target; }
    static boolean getIsEthical() { return isEthical; }
    static String getKnownFor() { return knownFor; }
	
	  public static void hacker(){
		System.out.println("alias:"+getAlias());
		System.out.println("skillLevel:"+getSkillLevel());
		System.out.println("target:"+getTarget());
		System.out.println("isEthical:"+getIsEthical());
		System.out.println("knownFor:"+getKnownFor());

}	
}