class PipeRunner{

public static void main(String a[]){
	
	String indegreints[]={"Metals","Plastics","PVC","PEX"};
	String indegreints1[]={"Polypropylene","Polythylene","Chlorinated Polyvinyl Chloride"};
	
	Pipe pipe = new Pipe();
	pipe.pipeName="Metalspipe";
	pipe.indegreints=indegreints;
	pipe.getPipeDetails();

	Pipe pipe1 = new Pipe();
	pipe.pipeName="Safari";
	pipe1.indegreints=indegreints1;
	pipe1.getPipeDetails();
	
	
}
}