package lab11layeredarchitecture;

public class Purchaseservice implements IPurchase{
	IPurchase dp=null;
	public Purchaseservice() {
		super();
		dp= new PurchaseConnectPool();
	}

	@Override
	public boolean insertPurchaseDetails(Customer p) throws CustomException {
		return dp.insertPurchaseDetails(p);
		
	}

}
