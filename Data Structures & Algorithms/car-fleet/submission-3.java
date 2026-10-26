class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        //(target - position) / speed

         Stack<Double> stack = new Stack<>();

		Integer[] indices = new Integer[position.length];
		
		for (int i = 0; i < indices.length; i++) {
			indices[i] = i;
		}

        Arrays.sort(indices, (a, b) -> Integer.compare(position[b], position[a]));

		for(int i = 0; i < indices.length; i++) {

			int currentIndex = indices[i];

			int currentPosition = position[currentIndex];
			
			int currentSpeed = speed[currentIndex];


			double arrivalTime = (double) (target - currentPosition) / currentSpeed;

			if(stack.isEmpty()) {
				stack.push(arrivalTime);
			}

			if(arrivalTime > stack.peek()) {
				stack.push(arrivalTime);
			}

		}

        return stack.size();


    }
}
