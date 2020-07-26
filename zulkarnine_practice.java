package FifthLecture;
/* CarClass is a class.A class contains many methods and 
   many objects also. it also contains constructor*/
public class CarClass {
	public String manufactureName;
	private String modelName;
	private String carKeyValue;
	private String passWordString;
	public int engineCC;
	public float carWeight;
	private float fuelAmount;
    // it's a constructor
    public CarClass() { 
       manufacturerName = new String();
       modelName = new String();
       engineCC = 0;
       carWeight = 0;
       fuelAmount = 0;
    }
    public CarClass(String manu, String model, String key, int cc, float fuel) {
    	manufacturerName = manu;
    	modelName = model;
    	carKeyValue = key;
    	this.engineCC = engineCC;
    	fuelAmount = fuel;
    }
    public CarClass(String carName) {
       manufacturerName = new String(carName);
       modelName = new String();
       engineCC = 0;
       carWeight = 0;
       fuelAmount = 0;
    }
    public float presentAmountOfFuel() {
    	return fuelAmount;
    }
    public String getmanufacturerName() {
    	return manufacturerName;
    }
    public String getModelname() {
    	return modelName;
    }
    public void addFuel(float fuelAmount) {
    	this.fuelAmount += fuelAmount;
    }
    public boolean matchPassword(String userInput) {
    	return userInput.equals(passWordString);
    }


}