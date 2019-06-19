public class SinTable {

    static float[] sins = new float[1 << 16];

    static {
        for (int i = 0; i < sins.length; i++) {
            sins[i] = (float) Math.sin((i * Math.PI * 2) / sins.length);
        }
    }

    static float sin(float v) {
        v = (float) (v % (Math.PI * 2f));
        if (v < 0) v += Math.PI * 2f;
        v /= Math.PI * 2f;

        return sins[(int) (v * sins.length)];
    }

}
