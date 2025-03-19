package factoryMethod;

public class ProgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFactory fact=new FactoryCheapWeapon();
		IWeapon weapon=fact.create();
		weapon.power();
		
	}

}
