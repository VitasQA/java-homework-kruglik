package aqa_hw;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static String checkAccess(int age) {
        return age > 18 ? "Allowed" : "Denied";
    }

    public static boolean isPositive(int n) {
        return n >= 0 ? true : false;
    }

    public static String getGrade(int score) {
        if (score >= 0 && score <= 20) return "E";
        if (score >= 21 && score <= 40) return "D";
        if (score >= 41 && score <= 60) return "C";
        if (score >= 61 && score <= 80) return "B";
        if (score >= 81 && score <= 100) return "A";
        return "Error";
    }

    public static String blastOff(int start) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i >= 1; i--) {
            sb.append(i).append(" ");
        }
        sb.append("Поехали!");
        return sb.toString();
    }

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean hasBug(String[] messages) {
        if (messages == null) return false;
        for (String msg : messages) {
            if (msg != null && msg.equalsIgnoreCase("Bug")) {
                return true;
            }
        }
        return false;
    }

    public static String getEvenInRange(int start, int end) {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                if (!first) {
                    sb.append(" ");
                }
                sb.append(i);
                first = false;
            }
        }
        return sb.toString();
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String[] reverse(String[] arr) {
        if (arr == null) return new String[0];
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static double calcAverage(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0;
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    public static List<String> removeSpecificName(List<String> list, String nameToRemove) {
        if (list == null) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        for (String name : list) {
            if (!name.equals(nameToRemove)) {
                result.add(name);
            }
        }
        return result;
    }
}