package FifthLecture;
public class learningClass {
	private int aNumber = 12;
	private int anotherNumber;
	static private CarClass outCar = new CarClass();
	static private CarClass ourAnotherCar;
	public static void main(String[] args) {
		String nameString = ourCar.manufacturerName;
		String modelName;
		ourAnotherCar = new CarClass("TOYOTA", "Allion", "qwerty", 1500, 30);
		System.out.println("Manufacturer : " + ourAnotherCar.manufacturerName);
		System.out.println("Manufacturer : " + ourAnotherCar.getmodelName());
		System.out.println("Password Match: " + ourAnotherCar.matchpassword("afdfdfdsf"));
        //System.out.println(ourAnotherCar.);
        System.out.println("1st car name : " +ourCar.engineCC);
        System.out.println("2nd car CC: " + ourAnotherCar.engineCC);
        ourCar.presentAmountOfFuel();
	}
}