public class FindHeightOfTallestMountain2{

	public static void main(String[] args) {

		int[] height = {200,180,850,750,500};
		int tallest =height[0];

		for (int i = 1; i<height.length; i++ ) {
         
        
            if (height[i] > tallest) {
                tallest = height[i];
            }

					
				}
				
				
			System.out.println("Height of Tallest mountaain is: "+tallest);
}
}