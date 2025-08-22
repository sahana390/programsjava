class HospitalRunner{


public static void main(String []args){
	
Doctor doctor = new Doctor();
doctor.doctorName="sanjeev raj";
doctor.doctorid=3;
doctor.specialization="heart";
doctor.consulationPrice= 530000.00;
doctor.languageSpoken="english";
doctor.workingHours="six";

Department department = new Department();
department. departmentName = "emergency department";
department.noOfstaff=51;
department.noOfbeds=8;
department. locationHospital="bengaluru";
department.floorNumber=7;



department.doctor = doctor;

Hospital hospital = new Hospital();

hospital.hospitalName = "H.A.L hospital";
hospital.location= "marthalli HALroad";
hospital.noOfpatient = 222;

hospital.department = department;

hospital.getHospitalInfo();


}
}

