package BasicElementsOfJava;

import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

public class ipractice2 {

	public static void main(String[] args) throws Exception {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter branding expenses");
		int brandExpense = sc.nextInt();

		System.out.println("Enter travel expenses");
		int travelExpense = sc.nextInt();

		System.out.println("Enter food expenses");
		int foodExpense = sc.nextInt();

		System.out.println("Enter logistics expenses");
		int logExpense = sc.nextInt();

		int totalExpenses = brandExpense + foodExpense + logExpense + travelExpense;

		Double fintotalExpenses = Double.valueOf(totalExpenses);

		Double finBrandExpense = Double.valueOf(brandExpense);
		Double finTravelExpense = Double.valueOf(travelExpense);
		Double finFoodExpense = Double.valueOf(foodExpense);
		Double finLogExpense = Double.valueOf(logExpense);

		DecimalFormat df = new DecimalFormat("0.00");

		String fintotalExpensesTwoDec = df.format(fintotalExpenses);

		System.out.println("Total expenses: Rs." + fintotalExpensesTwoDec);

		double percentageBrand = (finBrandExpense / fintotalExpenses) * 100;
		double percentageTravel = (finTravelExpense / fintotalExpenses) * 100;
		double percentageFood = (finFoodExpense / fintotalExpenses) * 100;
		double percentageLogistics = (finLogExpense / fintotalExpenses) * 100;

		String finBrandExpenseTwoDec = df.format(percentageBrand);
		String finTravelExpenseTwoDec = df.format(percentageTravel);
		String finFoodExpenseTwoDec = df.format(percentageFood);
		String finLogExpenseTwoDec = df.format(percentageLogistics);

		System.out.println("Branding expenses percentage: " + finBrandExpenseTwoDec + "%");
		System.out.println("Travel expenses percentage: " + finTravelExpenseTwoDec + "%");
		System.out.println("Food expenses percentage: " + finFoodExpenseTwoDec + "%");
		System.out.println("Logistics expenses percentage: " + finLogExpenseTwoDec + "%");

	}

}
