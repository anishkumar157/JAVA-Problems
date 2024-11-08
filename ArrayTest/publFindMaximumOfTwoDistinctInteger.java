public class FindMaximumOfTwoDistinctInteger3{
	public static void main(String[] args) {
		int[] array = {5,7,8,6,5,8,4,2};
		int[] sumArr = new int[10];
		int sum = 0;
		int k = 0;

		for (int i =0;i<array.length ;i++ ) {

			for (int j = i+1;j<array.length ;j++ ) {

				if (array[i]==array[j]) {

					 sum = array[i] + array[j];

					 if (k<sumArr.length) {

					 	sumArr[k]=sum;
					 	k++;
					 						
					 }										
				}
				
			}
			
		}

		for (int i = 0; ; ) {
			
		}
	}
}