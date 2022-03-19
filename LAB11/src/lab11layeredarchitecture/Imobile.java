package lab11layeredarchitecture;

import java.util.List;

public interface Imobile {
	public List<Mobile> getAllMobiles() throws CustomException;
	boolean addNewMobile(Mobile m ) throws CustomException;
	
	boolean deleteMobile(int mobileid ) throws CustomException;
	List<Mobile> getMobilesOnPriceRange(int from,int to) throws CustomException;
	boolean updateMobileQuantityOnPurchase(int mobileid, int quantity ) throws CustomException;
}
