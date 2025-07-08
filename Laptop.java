class Laptop {
	static String brand = "Dell";
	public static void main(String[] details){
		System.out.println("main started");
		brandName(brand);
		System.out.println("main ended");
	}
	public static void brandName(String brand){
		System.out.println("The Laptop Brand is "+brand);
	}
}