public class CalculateTotalAmount8{

	public static void main(String[] args) {
		
	
	int totalChocleteInStore = 100;
	int dailyGoalX = 10;
	int earningForEachChocolete = 1;
	int ifExceedsDailyGoal = 2;
	int totalChocoletSoldInDayY = 20;
	int extraChocoletSold = totalChocoletSoldInDayY - dailyGoalX;
	int extraMoneyeranedInADay = 0;
	
	if(extraChocoletSold >0){

		extraMoneyeranedInADay = extraChocoletSold * 2;		
			
	}

	int totalMoneyEarnsPerDay = extraMoneyeranedInADay + (dailyGoalX * earningForEachChocolete);

	int totalAmountEarned = (totalChocleteInStore - totalChocoletSoldInDayY) * totalMoneyEarnsPerDay;

	System.out.println("Total amount of Money he made is: "+totalAmountEarned);
}




















}