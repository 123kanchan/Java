package lab11layeredarchitecture;

import java.util.List;

import org.apache.log4j.Logger;



public class Mobile_service implements Imobile  {
	static Logger myLogger=Logger.getLogger(Mobile_service.class.getName());
	Imobile dao = null;
	public Mobile_service() {
		super();
		dao = new MobileConnectPool();
		myLogger.info("mobile services are created");
	}

	@Override
	public List<Mobile> getAllMobiles() throws CustomException {
		List<Mobile> lst =dao.getAllMobiles();
		myLogger.info("returning the list of all mobiles");
		// Do Processing
		return lst;
		
	}

	@Override
	public boolean addNewMobile(Mobile m) throws CustomException {
		dao.addNewMobile(m);
		
		return false;
	}

	@Override
	public boolean deleteMobile(int mobileid) throws CustomException {
		dao.deleteMobile(mobileid);
		
		return false;
	}

	@Override
	public List<Mobile> getMobilesOnPriceRange(int from, int to) throws CustomException {
		List<Mobile> lst = dao.getMobilesOnPriceRange(from, to);
		myLogger.info("returning list of mobile in the price range");
		return lst;
	}

	@Override
	public boolean updateMobileQuantityOnPurchase(int mobileid, int quantity) throws CustomException {
		dao.updateMobileQuantityOnPurchase(mobileid, quantity);
		return false;
	}

}
