class BillRunner{
public static void main(String a[]){
System.out.println("main started");


Bill ref = new Bill();
ref.billId=1;
ref.billAmountWithTax = 230.78;
ref.planType="quaterly";
ref.paymentMethod="UPI";
ref.billDueDate="26/07/2025";
ref.isTaxInclusive=true;
ref.isBillPaid=true;
ref.isBillOverDue=false;
ref.billIssueDate="21/07/2025";

System.out.println("The  first Bill "+ ref.billAmountWithTax);
System.out.println("The  first Bill "+ ref.billId);
System.out.println("The  first Bill "+ ref.planType);
System.out.println("The  first Bill "+ ref.paymentMethod);
System.out.println("The  first Bill "+ ref.billDueDate);
System.out.println("The  first Bill "+ ref.isTaxInclusive);
System.out.println("The  first Bill "+ ref.isBillPaid);
System.out.println("The  first Bill "+ ref.isBillOverDue);
System.out.println("The  first Bill "+ ref.billIssueDate);


Bill ref1 = new Bill();
ref1.billId=2;
ref1.billAmountWithTax = 120.78;
ref1.planType="monthly";
ref1.paymentMethod="creditcard";
ref1.billDueDate="30/07/2025";
ref1.isTaxInclusive=true;
ref1.isBillPaid=true;
ref1.isBillOverDue=false;
ref1.billIssueDate="27/07/2025";

System.out.println("The  second Bill "+ ref1.billAmountWithTax);
System.out.println("The  second Bill "+ ref1.billId);
System.out.println("The  second Bill "+ ref1.planType);
System.out.println("The  second Bill "+ ref1.paymentMethod);
System.out.println("The  second Bill "+ ref1.billDueDate);
System.out.println("The  second Bill "+ ref1.isTaxInclusive);
System.out.println("The  second Bill "+ ref1.isBillPaid);
System.out.println("The  second Bill "+ ref1.isBillOverDue);
System.out.println("The  second Bill "+ ref1.billIssueDate);



Bill ref2 = new Bill();
ref2.billId=3;
ref2.billAmountWithTax = 100.00;
ref2.planType="Annual";
ref2.paymentMethod="UPI";
ref2.billDueDate="2/07/2025";
ref2.isTaxInclusive=true;
ref2.isBillPaid=true;
ref2.isBillOverDue=false;
ref2.billIssueDate="2/08/2025";

System.out.println("The  third Bill "+ ref2.billAmountWithTax);
System.out.println("The  third Bill "+ ref2.billId);
System.out.println("The  third Bill "+ ref2.planType);
System.out.println("The  third Bill "+ ref2.paymentMethod);
System.out.println("The  third Bill "+ ref2.billDueDate);
System.out.println("The  third Bill "+ ref2.isTaxInclusive);
System.out.println("The  third Bill "+ ref2.isBillPaid);
System.out.println("The  third Bill "+ ref2.isBillOverDue);
System.out.println("The  third Bill "+ ref2.billIssueDate);

Bill ref3 = new Bill();
ref3.billId=4;
ref3.billAmountWithTax = 230.78;
ref3.planType="28days";
ref3.paymentMethod="cash";
ref3.billDueDate="2/08/2025";
ref3.isTaxInclusive=true;
ref3.isBillPaid=true;
ref3.isBillOverDue=false;
ref3.billIssueDate="21/08/2025";

System.out.println("The  fourth Bill "+ ref3.billAmountWithTax);
System.out.println("The  fourth Bill "+ ref3.billId);
System.out.println("The  fourth Bill "+ ref3.planType);
System.out.println("The  fourth Bill "+ ref3.paymentMethod);
System.out.println("The  fourth Bill "+ ref3.billDueDate);
System.out.println("The  fourth Bill "+ ref3.isTaxInclusive);
System.out.println("The  fourth Bill "+ ref3.isBillPaid);
System.out.println("The  fourth Bill "+ ref3.isBillOverDue);
System.out.println("The  fourth Bill "+ ref3.billIssueDate);


Bill ref4 = new Bill();
ref4.billId=5;
ref4.billAmountWithTax = 200.78;
ref4.planType="50days";
ref4.paymentMethod="UPI";
ref4.billDueDate="6/08/2025";
ref4.isTaxInclusive=true;
ref4.isBillPaid=true;
ref4.isBillOverDue=false;
ref4.billIssueDate="5/08/2025";

System.out.println("The  fifth Bill "+ ref4.billAmountWithTax);
System.out.println("The  fifth Bill "+ ref4.billId);
System.out.println("The  fifth Bill "+ ref4.planType);
System.out.println("The  fifth Bill "+ ref4.paymentMethod);
System.out.println("The  fifth Bill "+ ref4.billDueDate);
System.out.println("The  fifth Bill "+ ref4.isTaxInclusive);
System.out.println("The  fifth Bill "+ ref4.isBillPaid);
System.out.println("The  fifth Bill "+ ref4.isBillOverDue);
System.out.println("The  fifth Bill "+ ref4.billIssueDate);

Bill ref5 = new Bill();
ref5.billId=6;
ref5.billAmountWithTax = 350.00;
ref5.planType="quaterly";
ref5.paymentMethod="UPI";
ref5.billDueDate="26/05/2025";
ref5.isTaxInclusive=true;
ref5.isBillPaid=true;
ref5.isBillOverDue=false;
ref5.billIssueDate="5/06/2025";

System.out.println("The  sixth Bill "+ ref5.billAmountWithTax);
System.out.println("The  sixth Bill "+ ref5.billId);
System.out.println("The  sixth Bill "+ ref5.planType);
System.out.println("The  sixth Bill "+ ref5.paymentMethod);
System.out.println("The  sixth Bill "+ ref5.billDueDate);
System.out.println("The  sixth Bill "+ ref5.isTaxInclusive);
System.out.println("The  sixth Bill "+ ref5.isBillPaid);
System.out.println("The  sixth Bill "+ ref5.isBillOverDue);
System.out.println("The  sixth Bill "+ ref5.billIssueDate);


Bill ref6 = new Bill();
ref6.billId=7;
ref6.billAmountWithTax =110.00;
ref6.planType="31days";
ref6.paymentMethod="UPI";
ref6.billDueDate="30/07/2025";
ref6.isTaxInclusive=true;
ref6.isBillPaid=true;
ref6.isBillOverDue=false;
ref6.billIssueDate="10/08/2025";

System.out.println("The  seventh Bill "+ ref6.billAmountWithTax);
System.out.println("The  seventh Bill "+ ref6.billId);
System.out.println("The  seventh Bill "+ ref6.planType);
System.out.println("The  seventh Bill "+ ref6.paymentMethod);
System.out.println("The  seventh Bill "+ ref6.billDueDate);
System.out.println("The  seventh Bill "+ ref6.isTaxInclusive);
System.out.println("The  seventh Bill "+ ref6.isBillPaid);
System.out.println("The  seventh Bill "+ ref6.isBillOverDue);
System.out.println("The  seventh Bill "+ ref6.billIssueDate);

Bill ref7 = new Bill();
ref7.billId=8;
ref7.billAmountWithTax = 230.78;
ref7.planType="quaterly";
ref7.paymentMethod="UPI";
ref7.billDueDate="26/07/2025";
ref7.isTaxInclusive=true;
ref7.isBillPaid=true;
ref7.isBillOverDue=false;
ref7.billIssueDate="21/07/2025";

System.out.println("The  Eight Bill "+ ref7.billAmountWithTax);
System.out.println("The  Eight Bill "+ ref7.billId);
System.out.println("The  Eight Bill "+ ref7.planType);
System.out.println("The  Eight Bill "+ ref7.paymentMethod);
System.out.println("The  Eight Bill "+ ref7.billDueDate);
System.out.println("The  Eight Bill "+ ref7.isTaxInclusive);
System.out.println("The  Eight Bill "+ ref7.isBillPaid);
System.out.println("The  Eight Bill "+ ref7.isBillOverDue);
System.out.println("The  Eight Bill "+ ref7.billIssueDate);

Bill ref8 = new Bill();
ref8.billId=9;
ref8.billAmountWithTax = 200.18;
ref8.planType="quaterly";
ref8.paymentMethod="UPI";
ref8.billDueDate="6/05/2025";
ref8.isTaxInclusive=true;
ref8.isBillPaid=true;
ref8.isBillOverDue=false;
ref8.billIssueDate="21/06/2025";

System.out.println("The   ninth Bill "+ ref8.billAmountWithTax);
System.out.println("The  ninth Bill "+ ref8.billId);
System.out.println("The  ninth Bill "+ ref8.planType);
System.out.println("The  ninth Bill "+ ref8.paymentMethod);
System.out.println("The  ninth Bill "+ ref8.billDueDate);
System.out.println("The  ninth Bill "+ ref8.isTaxInclusive);
System.out.println("The  ninth Bill "+ ref8.isBillPaid);
System.out.println("The  ninth Bill "+ ref8.isBillOverDue);
System.out.println("The  ninth Bill "+ ref8.billIssueDate);

Bill ref9 = new Bill();
ref9.billId=10;
ref9.billAmountWithTax = 230.78;
ref9.planType="quaterly";
ref9.paymentMethod="UPI";
ref9.billDueDate="26/07/2025";
ref9.isTaxInclusive=true;
ref9.isBillPaid=true;
ref9.isBillOverDue=false;
ref9.billIssueDate="21/07/2025";

System.out.println("The  tenth Bill "+ ref9.billAmountWithTax);
System.out.println("The  tenth Bill "+ ref9.billId);
System.out.println("The  tenth Bill "+ ref9.planType);
System.out.println("The  tenth Bill "+ ref9.paymentMethod);
System.out.println("The  tenth Bill "+ ref9.billDueDate);
System.out.println("The  tenth Bill "+ ref9.isTaxInclusive);
System.out.println("The  tenth Bill "+ ref9.isBillPaid);
System.out.println("The  tenth Bill "+ ref9.isBillOverDue);
System.out.println("The  tenth Bill "+ ref9.billIssueDate);

Bill ref10 = new Bill();
ref10.billId=11;
ref10.billAmountWithTax = 230.78;
ref10.planType="quaterly";
ref10.paymentMethod="UPI";
ref10.billDueDate="30/10/2025";
ref10.isTaxInclusive=true;
ref10.isBillPaid=true;
ref10.isBillOverDue=false;
ref10.billIssueDate="5/10/2025";

System.out.println("The  Eleventh Bill "+ ref10.billAmountWithTax);
System.out.println("The  Eleventh Bill "+ ref10.billId);
System.out.println("The  Eleventh Bill "+ ref10.planType);
System.out.println("The  Eleventh Bill "+ ref10.paymentMethod);
System.out.println("The  Eleventh Bill "+ ref10.billDueDate);
System.out.println("The  Eleventh Bill "+ ref10.isTaxInclusive);
System.out.println("The  Eleventh Bill "+ ref10.isBillPaid);
System.out.println("The  Eleventh Bill "+ ref10.isBillOverDue);
System.out.println("The  Eleventh Bill "+ ref10.billIssueDate);

Bill ref11 = new Bill();
ref11.billId=12;
ref11.billAmountWithTax = 230.78;
ref11.planType="25days";
ref11.paymentMethod="UPI";
ref11.billDueDate="26/07/2025";
ref11.isTaxInclusive=true;
ref11.isBillPaid=true;
ref11.isBillOverDue=false;
ref11.billIssueDate="21/07/2025";

System.out.println("The  Twelth Bill "+ ref11.billAmountWithTax);
System.out.println("The  Twelth Bill "+ ref11.billId);
System.out.println("The  Twelth Bill "+ ref11.planType);
System.out.println("The  Twelth Bill "+ ref11.paymentMethod);
System.out.println("The  Twelth Bill "+ ref11.billDueDate);
System.out.println("The  Twelth Bill "+ ref11.isTaxInclusive);
System.out.println("The  Twelth Bill "+ ref11.isBillPaid);
System.out.println("The  Twelth Bill "+ ref11.isBillOverDue);
System.out.println("The  Twelth Bill "+ ref11.billIssueDate);

Bill ref12 = new Bill();
ref12.billId=13;
ref12.billAmountWithTax = 158.00;
ref12.planType="jio plus";
ref12.paymentMethod="UPI";
ref12.billDueDate="24/11/2025";
ref12.isTaxInclusive=true;
ref12.isBillPaid=true;
ref12.isBillOverDue=false;
ref12.billIssueDate="31/11/2025";

System.out.println("The  Thirteeth Bill "+ ref12.billAmountWithTax);
System.out.println("The  Thirteeth Bill "+ ref12.billId);
System.out.println("The  Thirteeth Bill "+ ref12.planType);
System.out.println("The  Thirteeth Bill "+ ref12.paymentMethod);
System.out.println("The  Thirteeth Bill "+ ref12.billDueDate);
System.out.println("The  Thirteeth Bill "+ ref12.isTaxInclusive);
System.out.println("The  Thirteeth Bill "+ ref12.isBillPaid);
System.out.println("The  Thirteeth Bill "+ ref12.isBillOverDue);
System.out.println("The  Thirteeth Bill "+ ref12.billIssueDate);

Bill ref13 = new Bill();
ref13.billId=14;
ref13.billAmountWithTax = 300.78;
ref13.planType="quaterly";
ref13.paymentMethod="UPI";
ref13.billDueDate="20/07/2025";
ref13.isTaxInclusive=true;
ref13.isBillPaid=true;
ref13.isBillOverDue=false;
ref13.billIssueDate="21/10/2025";

System.out.println("The  Fourteenth Bill "+ ref13.billAmountWithTax);
System.out.println("The  Fourteenth Bill "+ ref13.billId);
System.out.println("The  Fourteenth Bill "+ ref13.planType);
System.out.println("The  Fourteenth Bill "+ ref13.paymentMethod);
System.out.println("The  Fourteenth Bill "+ ref13.billDueDate);
System.out.println("The  Fourteenth Bill "+ ref13.isTaxInclusive);
System.out.println("The  Fourteenth Bill "+ ref13.isBillPaid);
System.out.println("The  Fourteenth Bill "+ ref13.isBillOverDue);
System.out.println("The  Fourteenth Bill "+ ref13.billIssueDate);

Bill ref14 = new Bill();
ref14.billId=15;
ref14.billAmountWithTax = 90.00;
ref14.planType="quaterly";
ref14.paymentMethod="UPI";
ref14.billDueDate="26/07/2025";
ref14.isTaxInclusive=true;
ref14.isBillPaid=true;
ref14.isBillOverDue=false;
ref14.billIssueDate="21/07/2025";

System.out.println("The  Fifteenth Bill "+ ref14.billAmountWithTax);
System.out.println("The  Fifteenth Bill "+ ref14.billId);
System.out.println("The  Fifteenth Bill "+ ref14.planType);
System.out.println("The  Fifteenth Bill "+ ref14.paymentMethod);
System.out.println("The  Fifteenth Bill "+ ref14.billDueDate);
System.out.println("The  Fifteenth Bill "+ ref14.isTaxInclusive);
System.out.println("The  Fifteenth Bill "+ ref14.isBillPaid);
System.out.println("The  Fifteenth Bill "+ ref14.isBillOverDue);
System.out.println("The  Fifteenth Bill "+ ref14.billIssueDate);

Bill ref15 = new Bill();
ref15.billId=16;
ref15.billAmountWithTax = 230.78;
ref15.planType="quaterly";
ref15.paymentMethod="UPI";
ref15.billDueDate="26/07/2025";
ref15.isTaxInclusive=true;
ref15.isBillPaid=true;
ref15.isBillOverDue=false;
ref15.billIssueDate="21/07/2025";

System.out.println("The  Fifteenth Bill "+ ref15.billAmountWithTax);
System.out.println("The  Sixteenth Bill "+ ref15.billId);
System.out.println("The  Sixteenth Bill "+ ref15.planType);
System.out.println("The  Sixteenth Bill "+ ref15.paymentMethod);
System.out.println("The  Sixteenth Bill "+ ref15.billDueDate);
System.out.println("The  Sixteenth Bill "+ ref15.isTaxInclusive);
System.out.println("The  Sixteenth Bill "+ ref15.isBillPaid);
System.out.println("The  Sixteenth Bill "+ ref15.isBillOverDue);
System.out.println("The  Sixteenth Bill "+ ref15.billIssueDate);

Bill ref16 = new Bill();
ref16.billId=17;
ref16.billAmountWithTax = 230.78;
ref16.planType="quaterly";
ref16.paymentMethod="UPI";
ref16.billDueDate="26/07/2025";
ref16.isTaxInclusive=true;
ref16.isBillPaid=true;
ref16.isBillOverDue=false;
ref16.billIssueDate="21/07/2025";

System.out.println("The  Seventeenth Bill "+ ref16.billAmountWithTax);
System.out.println("The  Seventeenth Bill "+ ref16.billId);
System.out.println("The  Seventeenth Bill "+ ref16.planType);
System.out.println("The  Seventeenth Bill "+ ref16.paymentMethod);
System.out.println("The  Seventeenth Bill "+ ref16.billDueDate);
System.out.println("The  Seventeenth Bill "+ ref16.isTaxInclusive);
System.out.println("The  Seventeenth Bill "+ ref16.isBillPaid);
System.out.println("The  Seventeenth Bill "+ ref16.isBillOverDue);
System.out.println("The  Seventeenth Bill "+ ref16.billIssueDate);

Bill ref17 = new Bill();
ref17.billId=18;
ref17.billAmountWithTax = 230.78;
ref17.planType="quaterly";
ref17.paymentMethod="UPI";
ref17.billDueDate="26/07/2025";
ref17.isTaxInclusive=true;
ref17.isBillPaid=true;
ref17.isBillOverDue=false;
ref17.billIssueDate="21/07/2025";

System.out.println("The  Eighteenth Bill "+ ref17.billAmountWithTax);
System.out.println("The  Eighteenth Bill "+ ref17.billId);
System.out.println("The  Eighteenth Bill "+ ref17.planType);
System.out.println("The  Eighteenth Bill "+ ref17.paymentMethod);
System.out.println("The  Eighteenth Bill "+ ref17.billDueDate);
System.out.println("The  Eighteenth Bill "+ ref17.isTaxInclusive);
System.out.println("The  Eighteenth Bill "+ ref17.isBillPaid);
System.out.println("The  Eighteenth Bill "+ ref17.isBillOverDue);
System.out.println("The  Eighteenth Bill "+ ref17.billIssueDate);

Bill ref18 = new Bill();
ref18.billId=19;
ref18.billAmountWithTax = 240.78;
ref18.planType="monthly";
ref18.paymentMethod="";
ref18.billDueDate="10/10/2025";
ref18.isTaxInclusive=true;
ref18.isBillPaid=true;
ref18.isBillOverDue=false;
ref18.billIssueDate="26/10/2025";

System.out.println("The  Nineteenth Bill "+ ref18.billAmountWithTax);
System.out.println("The  Nineteenth Bill "+ ref18.billId);
System.out.println("The  Nineteenth Bill "+ ref18.planType);
System.out.println("The  Nineteenth Bill "+ ref18.paymentMethod);
System.out.println("The  Nineteenth Bill "+ ref18.billDueDate);
System.out.println("The  Nineteenth Bill "+ ref18.isTaxInclusive);
System.out.println("The  Nineteenth Bill "+ ref18.isBillPaid);
System.out.println("The  Nineteenth Bill "+ ref18.isBillOverDue);
System.out.println("The  Nineteenth Bill "+ ref18.billIssueDate);

Bill ref19 = new Bill();
ref19.billId=20;
ref19.billAmountWithTax = 200.00;
ref19.planType="internation rooming";
ref19.paymentMethod="UPI";
ref19.billDueDate="5/09/2025";
ref19.isTaxInclusive=true;
ref19.isBillPaid=true;
ref19.isBillOverDue=false;
ref19.billIssueDate="8/09/2025";


System.out.println("The  Twenty Bill "+ ref19.billAmountWithTax);
System.out.println("The  Twenty Bill "+ ref19.billId);
System.out.println("The  Twenty Bill "+ ref19.planType);
System.out.println("The  Twenty Bill "+ ref19.paymentMethod);
System.out.println("The  Twenty Bill "+ ref19.billDueDate);
System.out.println("The  Twenty Bill "+ ref19.isTaxInclusive);
System.out.println("The  Twenty Bill "+ ref19.isBillPaid);
System.out.println("The  Twenty Bill "+ ref19.isBillOverDue);
System.out.println("The  Twenty Bill "+ ref19.billIssueDate);

System.out.println("main ended");
}

}