public class RunTest {
    public static void main(String[] args) {
        int n = 100000000;

        SinTable.sin(1);

       /* for (int i = 0; i < n; i++) {
            float v = (float) (i *2 * Math.PI / n);
            float math = (float) Math.sin(v);
            System.out.println("---------------------------");
            System.out.println(Math.sin(v));
            System.out.println(FromUE4.sin(v) + " " + Math.abs(FromUE4.sin(v) - math));
            System.out.println(SinTable.sin(v) + " " + Math.abs(SinTable.sin(v) - math));
        }*/

        long start = System.currentTimeMillis();
        float s1 = 0f;
        for (int i = 0; i <= n; i++) {
            //  float v = (float) (i *2 * Math.PI / n);
            s1 += FromUE4.sin((float) (i % (Math.PI * 2)));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        long start2 = System.currentTimeMillis();
        float s2 = 0f;
        for (int i = 0; i <= n; i++) {
            //  float v = (float) (i *2 * Math.PI / n);
            s2 += SinTable.sin(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

        float s3 = 0f;
        long start3 = System.currentTimeMillis();
        for (int i = 0; i <= n; i++) {
            //  float v = (float) (i *2 * Math.PI / n);
            s3 += Math.sin(i);
        }
        long end3 = System.currentTimeMillis();
        System.out.println(end3 - start3);

        System.out.println();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
