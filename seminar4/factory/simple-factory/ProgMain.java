package factory;

public class ProgMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WeaponFactory factory=new WeaponFactory();
		
		IWeapon weapon=null;
		weapon=factory.createWeapon(100);
		weapon.power();
	
	}

}
