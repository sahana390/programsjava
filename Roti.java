class Roti{
    int rotiId;
    String type;
    double diameterCm;
    int calories;
    boolean isWholeWheat;
    double pricePerPiece;

    public Roti() {
        System.out.println("Default constructor invoked");
    }
	
    public Roti(int rotiId) {
        this.rotiId = rotiId;
        System.out.println("Constructor with 1 param");
    }

    public Roti(int rotiId, String type) {
        this.rotiId = rotiId;
        this.type = type;
        System.out.println("Constructor with 2 params");
    }
	
    public Roti(int rotiId, String type, double diameterCm) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        System.out.println("Constructor with 3 params");
    }

    public Roti(int rotiId, String type, double diameterCm, int calories) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        System.out.println("Constructor with 4 params");
    }
	
    public Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        this.isWholeWheat = isWholeWheat;
        System.out.println("Constructor with 5 params");
    }
	
    public Roti(int rotiId, String type, double diameterCm, int calories, boolean isWholeWheat, double pricePerPiece) {
        this.rotiId = rotiId;
        this.type = type;
        this.diameterCm = diameterCm;
        this.calories = calories;
        this.isWholeWheat = isWholeWheat;
        this.pricePerPiece = pricePerPiece;
        System.out.println("Full constructor with 6 params");
    }
	
    public void getRotiInfo() {
        System.out.println("Roti ID: " + rotiId);
        System.out.println("Type: " + type);
        System.out.println("Diameter: " + diameterCm + " cm");
        System.out.println("Calories: " + calories);
        System.out.println("Whole Wheat: " + isWholeWheat);
        System.out.println("Price per piece: ₹" + pricePerPiece);
        System.out.println("---------------");
	}
}