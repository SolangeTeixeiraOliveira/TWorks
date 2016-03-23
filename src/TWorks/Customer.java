package TWorks;

public class Customer {
	private String customerType;
	private int qtdWeekday;
	private int qtdWeekend;
	private int total_price;
	private String hotel_name;
	
	//Constructor
	public Customer(String customerType){
		this.customerType = customerType;
		this.qtdWeekday = 0;
		this.qtdWeekend = 0;
		this.total_price = 0;
		this.hotel_name = "";
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getQtdWeekday() {
		return qtdWeekday;
	}

	public void setQtdWeekday(int qtdWeekday) {
		this.qtdWeekday = qtdWeekday;
	}

	public int getQtdWeekend() {
		return qtdWeekend;
	}

	public void setQtdWeekend(int qtdWeekend) {
		this.qtdWeekend = qtdWeekend;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public String getHotel_name() {
		return hotel_name;
	}

	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}

	public void addDay(String day, String week){
		if (week.equals("sun") || week.equals("sat"))
			this.qtdWeekend++;
		else if (week.equals("mon") || week.equals("tues"))
			this.qtdWeekday++;
	}

	public void setHotel(String name, int price){
		this.hotel_name = name;
		this.total_price = price;
	}
	
}
