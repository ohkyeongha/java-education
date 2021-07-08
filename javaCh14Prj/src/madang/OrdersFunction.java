package madang;
import java.util.ArrayList;

public class OrdersFunction {
	//Orders클래스 타입의 ArrayList 생성
	ArrayList<Orders> ordersList = new ArrayList<Orders>();
	
	void insertOrders(Orders order){
		ordersList.add(order);
	}
	
	void selectOrders() {
		System.out.println("----Orders Table----");
		System.out.println("ORDERSID\tCUSTID\tBOOKID\fSALEPRICE\tORDERDATE");
		for(int i=0 ; i < ordersList.size() ; i++) {
			System.out.println(ordersList.get(i).getOrderId()+"\t"
									+ordersList.get(i).getCustId()+"\t"
									+ordersList.get(i).getBookId()+"\t"
									+ordersList.get(i).getSaleprice()+"\t"
									+ordersList.get(i).getOrderdate());
			
		}
//		System.out.println(ordersList.toString());
	
	}
	
	void updateOrders(int orderId, int bookId) {	
		
		for(int i=0 ; i < ordersList.size() ; i++) {
			if(ordersList.get(i).getOrderId() == orderId) {
				ordersList.get(i).setBookId(bookId);
			}
		}
		
	}
	void deleteOrders(int orderId) {
		
		for(int i=0 ; i < ordersList.size() ; i++) {
			if(ordersList.get(i).getOrderId() == orderId) {
				ordersList.remove(i);
			}
		}
	}
}
