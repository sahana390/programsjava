class Coin {

    int coinId;
    String material[];
    String country;
    double value;
    float weight;
    String denomination;

    // Default constructor
    Coin() {
    }

    // Constructor with coinId and material
    Coin(int coinId, String material[]) {
        this.coinId=coinId;
        this.material=material;
    }

    // Constructor with country and value
    Coin(String country, double value) {
        this.country=country;
        this.value=value;
    }

    // Constructor with denomination
    Coin(String denomination) {
        this.denomination = denomination;
    }

    // Constructor with weight
    Coin(float weight) {
        this.weight = weight;
    }

    // Method to display coin details
    public void getCoisDetails(){
	System.out.println("---------------------------");
	System.out.println("The material of"+coinsId+"are");
	for(String material : material){
		System.out.println(material);
            }
        }
    }

