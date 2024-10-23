public class Problems{
	public static void main(String[] args) {
		int[] array = {10,7,9,4,3,8};

		findSumOfArray(array);

		countOddsAndEven(array);

		String name = "Mangaluru";

		int position = findFirstOccurence(name,'u');
		System.out.println("\nCharectr found At Position is: "+position+"\n");
	
	}

	public static void findSumOfArray(int[] array){
		int sum = 0;
		for(int i = 0; i<array.length; i++){
			sum+=array[i];
		}
		System.out.println("\nSum of Array is: "+sum+"\n");
	}

	public static void countOddsAndEven(int[] array){
		int oddCount = 0;
		int evenCount = 0;
		for(int i = 0; i<array.length; i++){
			
			if(array[i]%2!=0){
				oddCount+=1;
			}
			evenCount=evenCount+1;
		}
		System.out.println("\nOdd Count is: "+oddCount+"\n");
		System.out.println("\neven Count is: "+evenCount+"\n");
	}

	public static int findFirstOccurence(String name, char check){
		char[] charecter = name.toCharArray();
		for(int i = 0; i<charecter.length; i++){
			if(charecter[i]==check){
				return ++i;
			}

		}
		return -1;
	}	
}