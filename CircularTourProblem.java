public class CircularTourProblem {
    public static int findStartingPoint(int[] petrol, int[] distance) {
        int start = 0, deficit = 0, surplus = 0;

        for(int i=0; i<petrol.length; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                start = i + 1;
                deficit += surplus;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        int[] petrol = {5, 7, 8, 5};
        int[] distance = {7, 6, 4, 6};

        System.out.println(findStartingPoint(petrol, distance)); // Output: 1
    }
}
