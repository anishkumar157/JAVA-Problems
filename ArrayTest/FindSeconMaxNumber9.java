public class FindSeconMaxNumber9{

	public static void main(String[] args) {
		int[] arr = {4,5,6};

		int largest = arr[0];
		int secondLargest = 0;

		for (int i = 1; i < arr.length ; i++) {

				if (arr[i] > largest ) {

					secondLargest = largest;

					largest = arr[i];
					
				}
				else if (arr[i] > secondLargest && arr[i]<largest) {
					secondLargest = arr[i];
				}
				
			}

			
		

		System.out.println("Second Maximum Number is: "+secondLargest);
		System.out.println(" Maximum Number is: "+largest);
	}
}