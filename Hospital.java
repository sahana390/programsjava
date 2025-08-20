class Hospital{

public static void checkUp(String patientName, int age, long PhoneNumber, String email, String disease){
System.out.println("Started with check up");
Doctor.treatment(patientName,age,disease);
}
}