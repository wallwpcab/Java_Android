package FifthLecture;
public class SubCarClass extends CarClass {
	private float chargeInBattery;
	public SubCarClass() {
		super();
	}
	public SubCarClass(String manu, String model, String key, int Cc, float fl, float charge ) {
		super(manu, model, key, cc, fl);
		chargeInBattery =  charge;
	}
	public SubCarClass(String manu, String model, String key, int Cc, float fl, float charge ) {
		super(manu, model, key, cc, fl);
		chargeInBattery =  charge;
	}
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setchargeInBattery() {
		return chareInBattery 
	}
	@Override
	public void printAllInfo() {
		super.printAllInfo();
       /* System.out.println("\n\n");
        System.out.println("Manufacturer : "+ourSubCar.manufacturerName);
        System.out.println("Model Name : "+ourSubcar.getModelName);
        System.out.println("Password Match : "+ourSubcar.matchPassword("afdfff"));
        System.out.println("2nd car CC : "+ourSubcar.engineCC);
        System.out.println("Amount of Fuel : "+ourSubcar.presentAmountOfFuel() + "L");;
        ourSubCar.addFuel(2);
        System.out.println("Amount of Fuel after adding 2L : "+ourSubCar.presentAmountOfFuel + "df ");
        ourSubCar.runForSeconds(60);*/
        runForSeconds(60);
        System.out.println("Amount of Fuel after driving for 60s : "+ourSubCar.presentAmountOfFuel());
        System.out.println("Charge in Battery :" +ourSubCar.gerChargeInBattery());
        System.out.println("Color of car :"+ourSubCar.gerColorString());


	}
}