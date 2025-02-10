/**
 * SkillBuilder3 is a class for completing
 *  Skill Builder 3 in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder3
{
    private static String repeat(String s, int numOfTimesToRepeat)
    {
        String result = "";
        // TODO: replace this line with your code
        result = s.repeat(numOfTimesToRepeat);
        return result;
    }

    public static String leftRightTriangle(int height)
    {
        //String str = "";
        // TODO: replace this line with your code
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= height; i++){ //add spaces before the star
            str.append("*".repeat(i)).append("\n");
        }
        return str.toString();
        //return str;
    }

    public static String rightRightTriangle(int height)
    {
        //String str = "";
        // TODO: replace this line with your code
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            str.append(" ".repeat(height - i)).append("*".repeat(i)).append("\n");
        }
        return str.toString();
        //return str;
    }

    public static String circle(int radius)
    {
        String str = "";
        // TODO: replace this line with your code
        StringBuilder sb = new StringBuilder();
        double rSquared = Math.pow(radius, 2);

        for (int i = -radius; i <= radius; i++) {
            for (int x = -radius; x <= radius; x++) {
                if (Math.round(Math.sqrt(i * i + x * x)) <= radius) {
                    sb.append("*");
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        //return sb.toString();
        return str;
    }

    public static long sumOfDivisors(long number) {
        long sum = 0;
        // TODO: replace this line with your code
        sum = 1; // Start from 1, as 1 is always a divisor
        for (long i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        //sum += number;
        return sum;
    }
    public static boolean isPerfect(long number)
    {
        return false;
    }

    public static long sumOfDivisorsUsingWhile(long number){
        long sum = 0;
        // TODO: replace this line with your code
        long i = 1;
        while (i <= number) {
            if (number % i == 0) {
                sum += i;
            }
            i++;
        }
        //sum += number; // Include the number itself
        return sum;
    }
}
