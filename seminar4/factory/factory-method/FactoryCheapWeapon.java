package factoryMethod;

public class FactoryCheapWeapon implements IFactory{

	@Override
	public IWeapon create() {
		// TODO Auto-generated method stub
		return new CheapWeapon();
	}

}
