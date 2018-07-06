public class Cycles {
    public void whileCycle(int i) {
        System.out.println("While cycle");
        while (i <= 10) {// true
            System.out.println("value: " + i);
            i++;
        }
        i = 0;
        System.out.println("While cycle (true)& break");
        while (true) {
            if (i > 10) break;//false
            System.out.println("value: " + i);
            i++;
        }
        System.out.println("Do while cycle");
        i = 0;
        do {
            if (i == 0) break;
            System.out.println("value: " + i);
            i++;
        } while (i <= 10);//true

    }
}
