public class Area {

    public abstract static class Figura {
        public static double areas() {
            return 0;
        }
    }

        public static void calculararea(Figura[] v) {
        double total = 0;
            for (Figura figura : v) {

                total += Figura.areas();
            }


        System.out.println("El area total es " + Figura.areas());


    }
}

