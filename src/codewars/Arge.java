package codewars;

public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int currentPop = p0;
        int years = 0;

        while (currentPop < p) {
            currentPop += currentPop * (percent / 100) + aug;
            years++;
        }

        return years;
    }
}
