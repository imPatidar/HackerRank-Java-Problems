import java.util.Scanner;

class solution4 {
    public static void main(String[] args) {

        inventory[] in = new inventory[4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < in.length; i++) {

            String id = sc.nextLine();
            int maxQuantity = sc.nextInt();
            sc.nextLine();
            int curQuantity = sc.nextInt();
            sc.nextLine();
            int threshold = sc.nextInt();
            sc.nextLine();
            in[i] = new inventory(id,maxQuantity, curQuantity, threshold);
        }

        int limitingThreshold = sc.nextInt();
        System.out.println(limitingThreshold);
        inventory[] results = getThreshold(in, limitingThreshold);

        for (int i = 0; i < results.length; i++) {
            if (results[i].getThreshold() >= 75) {
                System.out.println(results[i].getId() + " " + "Critical Filing");
            } else if (results[i].getThreshold() <= 74 && results[i].getThreshold() >= 50) {
                System.out.println(results[i].getId() + " " + "Moderate Filing");
            } else {
                System.out.println(results[i].getId() + " " + "Non-Critical Filing");
            }
        }
    }

    public static inventory[] getThreshold(inventory[] in, int limitingThreshold) {
        inventory[] temp = new inventory[4];
        int j = 0;

        for (int k = 0; k < in.length; k++) {

            if (in[k].getThreshold() <= limitingThreshold) {
                temp[j++] = in[k];
            }
        }

        return temp;
    }
}

public class inventory {

    String id;
    int maxQuantity;
    int curQuantity;
    int threshold;

    public inventory(String id, int maxQuantity, int curQuantity, int threshold) {
        this.id = id;
        this.maxQuantity = maxQuantity;
        this.curQuantity = curQuantity;
        this.threshold = threshold;
    }

    public String getId() {
        return id;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public int getCurQuantity() {
        return curQuantity;
    }

    public int getThreshold() {
        return threshold;
    }
}
