package TinkJava.Rabbit;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rabbit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Map<Integer, Integer> bookHeights = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int height = scanner.nextInt();
            bookHeights.put(height, bookHeights.getOrDefault(height, 0) + 1);
        }

        int stackCount = bookHeights.size();
        ArrayList<Integer> stackHeights = new ArrayList<>(bookHeights.keySet());
        Collections.sort(stackHeights);

        System.out.println(stackCount);
        for (int height : stackHeights) {
            System.out.print(height + " ");
        }
    }
}


class BookStacking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] heights = new Integer[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        Arrays.sort(heights);

        int[] stacks = new int[n];
        int numStacks = 0;

        for (int height : heights) {
            boolean placed = false;
            for (int j = 0; j < numStacks; j++) {
                if (stacks[j] == height) {
                    placed = true;
                    stacks[j]++;
                    break;
                }
            }
            if (!placed) {
                stacks[numStacks++] = 1;
            }
        }

        System.out.println(numStacks);
        for (int i = 0; i < numStacks; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(stacks[i]);
        }
        scanner.close();
    }
}

class Result {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] heights = new Integer[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        Arrays.sort(heights);

        int[] stacks = new int[n];
        int numStacks = 0;

        for (int height : heights) {
            boolean placed = false;
            for (int j = 0; j < numStacks; j++) {
                if (stacks[j] == height) {
                    placed = true;
                    stacks[j]++;
                    break;
                }
            }
            if (!placed) {
                stacks[numStacks++] = 1;
            }
        }

        System.out.println(numStacks);
        for (int i = 0; i < numStacks; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(stacks[i]);
        }
        scanner.close();
    }
}

