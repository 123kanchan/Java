package lab11layeredarchitecture;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.PropertyConfigurator;

public class App {

	public static void main(String[] args) {
		PropertyConfigurator.configure("resources/log4j.properties");//changes
		Imobile service = new Mobile_service();
		//purchase_Dao_ConnectPool pb = new purchase_Dao_ConnectPool();
		System.out.println("1. Add Purchase Details");
		System.out.println("2. Insert New Mobile");
		System.out.println("3. Get All Mobiles ");
		System.out.println("4. Delete Mobile");
		System.out.println("5. Get Mobiles Between Price Range");
		try {
			Scanner sc = new Scanner(System.in);
			//int ch= sc.nextInt();
			switch(sc.nextInt()){
			case 1:
				IPurchase pur = new Purchaseservice();
				LocalDate d1 = LocalDate.now();
			Customer p = new Customer(12333,"prenna", "k41@gmailcom", "8888811102", d1, 1234);
				pur.insertPurchaseDetails(p);
				service.updateMobileQuantityOnPurchase(1234,1 );
			
			break;
			case 2:
			
			Mobile m = new Mobile(2, "Vivo v 15", 19000, 1);
			service.addNewMobile(m);
				break;
			case 3:
			List<Mobile> lst1 =service.getAllMobiles();
			for(Mobile mob : lst1) {
				System.out.println(mob);
			}
				break;
			case 4:
			service.deleteMobile(1236);
				break;
			case 5:
			List<Mobile> lst2 =service.getMobilesOnPriceRange(10000, 20000);
			for(Mobile mob : lst2) {
				System.out.println(mob);
			}
				break;
			default:
				System.out.println("Invalid choice");
			sc.close();
		}
		}catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
