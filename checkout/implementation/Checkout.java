package implementation;
 		
public class Checkout {

	int total = 0;
 	
	public void add(int count, int price) {
		total += count * price;
	}

	public int total() {
    	return total;
	}	
 	
}

