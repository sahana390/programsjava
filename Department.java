class Department {

String departmentName;
int noOfstaff;
int noOfbeds;
String locationHospital;
int floorNumber;
Doctor doctor;


public void getDepartmentInfo(){
	
	System.out.println("Fetching department info");
	System.out.println("The departmentName is:"+departmentName);
	System.out.println("The noOfstaff is:"+noOfstaff);
	System.out.println("The noOfbeds is:"+noOfbeds);
	System.out.println("The locationHospital is:"+locationHospital);
	System.out.println("The floorNumber is:"+floorNumber);
	this.doctor.getDoctorDetails();
	
}

}
