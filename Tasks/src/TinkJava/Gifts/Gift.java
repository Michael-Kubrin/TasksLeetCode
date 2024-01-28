package TinkJava.Gifts;

import java.util.*;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Gift {

    static String canPrepareGifts(int n, int[][] gifts) {
        Arrays.sort(gifts, Comparator.comparingInt(a -> a[1]));

        int currentDay = 0;

        for (int[] gift : gifts) {
            int arrivalDay = gift[0];
            int sendByDay = gift[1];
            int preparationDays = gift[2];

            currentDay = Math.max(currentDay, arrivalDay);

            if (currentDay + preparationDays > sendByDay) {
                return "NO";
            }

            currentDay += preparationDays;
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] gifts = new int[n][3];

        for (int i = 0; i < n; i++) {
            gifts[i][0] = scanner.nextInt();
            gifts[i][1] = scanner.nextInt();
            gifts[i][2] = scanner.nextInt();
        }

        System.out.println(canPrepareGifts(n, gifts));
    }
}


class Result {

    public class GiftPreparation {

        static class Gift {
            int startDay;
            int prepTime;
            int dueDay;

            public Gift(int startDay, int prepTime, int dueDay) {
                this.startDay = startDay;
                this.prepTime = prepTime;
                this.dueDay = dueDay;
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            PriorityQueue<Gift> gifts = new PriorityQueue<>(Comparator.comparingInt((Gift g) -> g.dueDay)
                    .thenComparingInt(g -> g.prepTime));

            for (int i = 0; i < n; i++) {
                int d_i = scanner.nextInt();
                int c_i = scanner.nextInt();
                int s_i = scanner.nextInt();
                gifts.offer(new Gift(d_i, c_i, s_i));
            }

            int currentDay = 0;
            boolean canPrepareInTime = true;


            while (!gifts.isEmpty() && canPrepareInTime) {
                Gift gift = gifts.poll();

                currentDay = Math.max(currentDay, gift.startDay);

                if (currentDay + gift.prepTime - 1 <= gift.dueDay) {
                    currentDay += gift.prepTime;
                } else {
                    canPrepareInTime = false;
                }
            }

            System.out.println(canPrepareInTime ? "YES" : "NO");
            scanner.close();
        }
    }
}