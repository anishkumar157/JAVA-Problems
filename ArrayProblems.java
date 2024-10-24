public class ArrayProblems{
	
	public static void main(String[] args) {
		
		int[] arr = {46,85,52,46,9,2,38};
		int n = arr.length;

		boolean result = findDublicaValues(arr, n);
		System.out.println(result);

		int[] newArray = removeElements(arr, n, 46);

		for (int i = 0; i< newArray.length ;i++ ) {
			System.out.println(newArray[i]);			
		}
	}

	public static boolean findDublicaValues(int[] arr, int n){

		for (int i = 0; i < n ; i++ ) {
			for (int j = i+1; j<n ;j++ ) {
				if (arr[i]==arr[j]) {
					return true;				
				}							
			}	
		}
		return false;
	}


	public static int[] removeElements(int[] arr, int n, int number){

		int count = 0;
		for (int i = 0;i < n ; i++ ) {
			if (arr[i]==number) {

				count+=1;							
			}			
		}

		int[] newArray = new int[n-count];
		int j=0;

		for (int i = 0; i<n ; i++) {

			if(arr[i]!=number){				

				newArray[j]=arr[i];	
				if (j<=newArray.length) {

					j++;									
				}				
			}			
		}

		return newArray;
	}
}