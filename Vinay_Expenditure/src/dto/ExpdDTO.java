package dto;

public class ExpdDTO 
{
	int Expd_No ;
	String Name ;
	String Items ;
	int Amount ;
	String Date ;
	int min;
	int max;
	int sum;
	int avg;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public int getExpd_No() {
		return Expd_No;
	}
	public void setExpd_No(int expd_No) {
		Expd_No = expd_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "ExpdDTO [Expd_No=" + Expd_No + ", Name=" + Name + ", Items="
				+ Items + ", Amount=" + Amount + ", Date=" + Date + "]";
	}
	
	

}
