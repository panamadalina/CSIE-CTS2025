package classes;

import java.util.ArrayList;

public class Supermarket {
	private String name;
	private int area;
	private ArrayList<Market> shops;
		
	public Supermarket(String name, int area, ArrayList<Market> shops) {
		super();
		this.name = name;
		this.area = area;
		this.shops = shops;
	}

	public String getBiggestMarketByArea(ETypeMarket typeMarket) {
		Market result = shops.get(0);
		for(Market m: shops) {
			if(m.getTypeMarket() == typeMarket && m.getAreaMP()>result.getAreaMP())
				result = m;	
		}
		return result.getName();
	}
	
	public float calculatePriceInsurance(IAuthorization authorization) throws ExceptionCalculateInsurance {
		if(authorization.hasInsurance(this)){
			float tax = authorization.priceInsuranceMP();
			int area = 0;
			for(Market m: shops) {
				area += m.getAreaMP();
			}
			return tax * area;
		}
		else
			throw new ExceptionCalculateInsurance();
	}
}
