package adapter;

import adapter.adapter.DBSocketAdapter;
import adapter.adapter.GBSocketAdapter;
import adapter.iface.DBSocketImpl;
import adapter.iface.GBSocketImpl;

public class DesignPatternDemo {

	public static void main(String[] args) {
		DeGuoHotel hotel = new DeGuoHotel();
		hotel.setDBSocket(new DBSocketAdapter(new DBSocketImpl()));
//		hotel.setGuoJiSocket(new GBSocketAdapter(new GBSocketImpl()));
		hotel.charge();
	}

}
