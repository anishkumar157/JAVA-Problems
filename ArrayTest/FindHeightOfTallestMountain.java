public class FindHeightOfTallestMountain{

	public static void main(String[] args) {

		int[] height = {200,180,450,750,500};
		int tallest =0;

		for (int i = 0; i<height.length; i++ ) {

			for (int j = i+1;j<height.length;j++ ) {
				if (height[i]>height[j]) {
					tallest =  height[i];

					
				}
				
			}

					
				
			}	
			System.out.println("Height of Tallest mountaain is: "+tallest);
}
}