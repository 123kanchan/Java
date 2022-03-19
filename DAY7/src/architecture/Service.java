package architecture;

import java.util.List;

public class Service implements IService {
	// Dependency Injection for Dao.but not a true dependancy 
	//factory class factory of object creates actual connection pool
		
	private IDao dao = null;
		
		public Service() {
			this.dao = new Dao();
			System.out.println("Constructor of Service Layer is executed.");
		}
		
		@Override
		public List<String> getAllEmployees() throws CustomException {
			List<String> lst = dao.getAllRecords();
			// Operations on data
			System.out.println("The getAllEmployees() is executed.");
			return lst;
		}

}
