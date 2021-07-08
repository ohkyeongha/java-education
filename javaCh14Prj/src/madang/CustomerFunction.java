package madang;
import java.util.ArrayList;

public class CustomerFunction {
	//Customer클래스 타입의 ArrayList 생성
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	void insertCustomer(Customer customer){
		customerList.add(customer);
	}
	
	void selectCustomer() {
		System.out.println("----Book Table----");
		System.out.println("BOOKID\tBOOKNAME\tPUBLISHER\tPRICE");
		for(int i=0 ; i < customerList.size() ; i++) {
			System.out.println(customerList.get(i).getCustId()+"\t"
									+customerList.get(i).getName()+"\t"
									+customerList.get(i).getAddress()+"\t\t"
									+customerList.get(i).getPhone());
		}
//		System.out.println(customerList.toString());
	
	}
	
	void updateCustomer(int custId, String Name) {	
				
		for(int i=0 ; i < customerList.size() ; i++) {
			if(customerList.get(i).getCustId() == custId) {
				customerList.get(i).setName(Name);
			}
		}
		
	}
	void deleteCustomer(int custId) {
		
		for(int i=0 ; i < customerList.size() ; i++) {
			if(customerList.get(i).getCustId() == custId) {
				customerList.remove(i);
			}
		}
	}
}
