package architecture;

public class TestLayeredArchitecture {
public static void main(String[] args) {
	IService service = new Service(); // Connection/Pool ready with Dao and Service Objects.
	
	try {
		service.getAllEmployees();
		
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//mock object pretends to be original object