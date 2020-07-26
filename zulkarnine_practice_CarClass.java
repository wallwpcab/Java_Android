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
       fuelAmount =   0;
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
    public void printAllInfo() {
        System.out.println("\n\n");
        System.out.println("Manufacturer : "+ourSubCar.manufacturerName);
        System.out.println("Model Name : "+ourSubcar.getModelName);
        System.out.println("Password Match : "+ourSubcar.matchPassword("afdfff"));
        System.out.println("2nd car CC : "+ourSubcar.engineCC);
        System.out.println("Amount of Fuel : "+ourSubcar.presentAmountOfFuel() + "L");;
        ourSubCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : "+ourSubCar.presentAmountOfFuel + "df ");
        ourSubCar.runForSeconds(60);
        System.out.println("Amount of Fuel after driving for 60s : "+ourSubCar.presentAmountOfFuel());
        System.out.println("Charge in Battery :" +ourSubCar.gerChargeInBattery());
        System.out.println("Color of car :"+ourSubCar.gerColorString());


  }


}