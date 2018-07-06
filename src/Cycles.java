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

    public void forCycle(int i) {
//      fori
        for (int j = 1; j <= 100; j += 20) {
            i *= j;
            System.out.println("I value: " + i);
        }
        System.out.println(i);

        int[] arr = {11, 23, 84, 5, 6, 7, 8, 9, 10, 20};
        System.out.println("ForEach");
//       iter
        int n = 1;
        for (int k : arr) {
                System.out.println(k);
        }
        System.out.println("Index = " + n);

    }
}
