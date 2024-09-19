/**
 * 
 */
package challenge_ShopToYouDrop;

import javax.swing.plaf.ToolTipUI;

/**
 * 
 */
public class ShopToYouDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] customersData = { { 39, 45, 56, 78, 101, 45, 34, 34 }, { 31, 55, 56, 83, 121, 65, 31, 5 },
				{ 11, 45, 26, 23 }, { 34, 5, 50, 45, 67, 123, 121, 122, 89, 76 }, { 21, 25, 80, 25, 57, 73, 71, 62 },
				{ 1, 23, 56, 78, 56, 34, 78, 5 }, { 10, 43, 69, 98, 126, 134, 178, 75, 89, 90 } };

		display2DArrayToConsole(customersData);

		totalCustomersPerWeek(customersData);

		peakCustomerTime(customersData);

		openingHoursPerDay(customersData);

		averageCustomersPerHourPerDay(customersData);

		// Average customers per hours
//		System.out.println("Day\tAverage customers per hour per day");
//		for (int i = 0; i < customersData.length; i++) {
//			System.out.print("Day " + (i + 1) + "\t");
//			for (int j = 0; j < customersData[i].length; j++) {
//				totalCustomersPerDay += customersData[i][j];
//			}
//			System.out.printf("%.2f", totalCustomersPerDay / customersData[i].length);
//			System.out.println();
//			totalCustomersPerDay = 0;
//		}

	}

	/**
	 * This method calculates the average customers per hour per day and prints this
	 * to the console
	 */
	public static void averageCustomersPerHourPerDay(int[][] customersData) {
		double totalCustomersPerDay = 0;
		double averageCustomersPerHour = 0;

		// Average customer per hours
		System.out.println("Day\tAverage customers per hour per day");
		for (int i = 0; i < customersData.length; i++) {
			System.out.print("Day " + (i + 1) + "\t");
			for (int j = 0; j < customersData[i].length; j++) {
				totalCustomersPerDay += customersData[i][j];
			}
			averageCustomersPerHour = totalCustomersPerDay / customersData[i].length;
			System.out.printf("%.2f", averageCustomersPerHour);
			System.out.println();
			totalCustomersPerDay = 0;
		}
	}

	/**
	 * This method displays the opening hours per day of the shop
	 * 
	 * @param customersData
	 */
	public static void openingHoursPerDay(int[][] customersData) {
		// Number of hours opened per day

		for (int i = 0; i < customersData.length; i++) {
			System.out.println("Day " + (i + 1) + ": " + customersData[i].length + " hours");
		}
	}

	/**
	 * This method finds the maximum number of customer per hour during the week and
	 * indicates its index position (zero indexed)
	 * 
	 * @param customersData
	 */
	public static void peakCustomerTime(int[][] customersData) {
		// Highest customers per hour

		int currentMax = customersData[0][0];
		int rowIndex = 0;
		int columnIndex = 0;

		for (int i = 0; i < customersData.length; i++) {
			for (int j = 0; j < customersData[i].length; j++) {
				if (currentMax < customersData[i][j]) {
					currentMax = customersData[i][j];
					rowIndex = i;
					columnIndex = j;
				}
			}
		}
		System.out.println("Highest customer numbers per hour: " + currentMax);
		System.out.println("This can be found at index [[" + rowIndex + "] [" + columnIndex + "]]");
	}

	/**
	 * This method calculates the total customers per week
	 * 
	 * @param customersData
	 */
	public static void totalCustomersPerWeek(int[][] customersData) {
		// Total customers for week

		int total = 0;

		for (int i = 0; i < customersData.length; i++) {
			for (int j = 0; j < customersData[i].length; j++) {
				total += customersData[i][j];
			}
		}
		System.out.println("Total customer: " + total);
	}

	/**
	 * This method displays a 2D Array to the console
	 * 
	 * @param customersData - input array
	 */
	public static void display2DArrayToConsole(int[][] customersData) {
		// Display information
		System.out.println("Shopping Stats");
		for (int i = 0; i < customersData.length; i++) {
			System.out.print("Day " + (i + 1) + ": ");
			for (int j = 0; j < customersData[i].length; j++) {
				System.out.print(customersData[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
