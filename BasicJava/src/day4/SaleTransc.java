package day4;

public class SaleTransc {

	
		private double quantity;
		private double price;
		private static double taxRate=0.12;
		private static int objectCount;

		public SaleTransc(double price) {
			this(price,1);
		}

		public SaleTransc(double price, double quantity) {
			SaleTransc.objectCount++;
			this.price = price;
			this.quantity = quantity;
		}

		void setPrice(double price) {
			this.price = price;
		}

		double getPrice() {
			return price;
		}

		void setQuantity(double quantity) {
			this.quantity = quantity;
		}

		double getQuantity() {
			return quantity;
		}

		double getAmount() {
			double total = price * quantity;
			return total + (total * taxRate);
		}
		public static double getTaxRate()
		{
			return taxRate;
		}
		public static void setTaxRate(double taxRate)
		{
			SaleTransc.taxRate = taxRate;
		}
		public static int objectCount()
		{
			return SaleTransc.objectCount;
		}
		public static void main(String[] args) {
			System.out.println(SaleTransc.objectCount);
			SaleTransc rv = new SaleTransc(100);
			System.out.println(SaleTransc.objectCount);
		}
	}


