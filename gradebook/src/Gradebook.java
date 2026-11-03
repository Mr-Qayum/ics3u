import java.util.Scanner;

public class Gradebook {

    public static void printGradebook(int[][] scores) {
        System.out.printf("%-10s", "");
        for (int col = 0; col < scores[0].length; col++) {
            System.out.printf(" | Subj %-2d", col + 1);
        }
        System.out.println();
        System.out.println("----------------------------------------");

        for (int row = 0; row < scores.length; row++) {
            System.out.printf("%-10s", "Student " + row);
            for (int col = 0; col < scores[row].length; col++) {
                System.out.printf(" | %-7d", scores[row][col]);
            }
            System.out.println();
        }
    }

    public static double calculateStudentAverage(int[][] scores, int studentIndex) {
        int sum = 0;

        for (int col = 0; col < scores[studentIndex].length; col++) {
            sum += scores[studentIndex][col];
        }

        return sum / scores[studentIndex].length;
    }

    public static double calculateSubjectAverage(int[][] scores, int subjectIndex) {
        int sum = 0;

        for (int row = 0; row < scores.length; row++) {
            sum += scores[row][subjectIndex];
        }

        return sum / scores.length;
    }

    public static int findHighestScore(int[][] scores) {
        int maxScore = 0;

        for (int row = 0; row < scores.length; row++) {
            for (int col = 0; col < scores[row].length; col++) {
                maxScore = Math.max(maxScore, scores[row][col]);
            }
        }

        return maxScore;
    }

    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        int[][] scores = { { 85, 92, 78 }, { 90, 88, 94 }, { 70, 65, 72 }, { 98, 95, 100 } };

        System.out.println("Welcome to Gradebook!");

        loop: while (true) {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Print gradebook");
            System.out.println("2. Calculate student average");
            System.out.println("3. Calculate subject average");
            System.out.println("4. Find highest score");
            System.out.println("5. Quit");

            switch (keyboard.nextInt()) {
                case 1:
                    printGradebook(scores);
                    break;
                case 2:
                    System.out.println("Please enter student index:");
                    System.out.println(calculateStudentAverage(scores, keyboard.nextInt()));
                    break;
                case 3:
                    System.out.println("Please enter subject index:");
                    System.out.println(calculateSubjectAverage(scores, keyboard.nextInt()));
                    break;
                case 4:
                    System.out.println(findHighestScore(scores));
                    break;
                case 5:
                    break loop;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        keyboard.close();
    }
}
