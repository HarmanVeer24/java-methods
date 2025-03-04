import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];
        // user input heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = sc.nextInt();
        }
        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        //printing result 
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }

    // Method to calculate sum of all heights
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate mean height
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
