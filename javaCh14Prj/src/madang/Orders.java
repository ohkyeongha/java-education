package madang;
import java.util.Date;

public class Orders {
	private	int		orderId;
	private	int		custId;
	private	int		bookId;
	private	int		saleprice;
	private	Date	orderdate;
	
	public Orders() {
		super();
	}
	
	public Orders(int orderId, int custId, int bookId, int saleprice, Date orderdate) {
		super();
		this.orderId = orderId;
		this.custId = custId;
		this.bookId = bookId;
		this.saleprice = saleprice;
		this.orderdate = orderdate;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", custId=" + custId + ", bookId=" + bookId + ", saleprice=" + saleprice
				+ ", orderdate=" + orderdate + "]";
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(int saleprice) {
		this.saleprice = saleprice;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
}
