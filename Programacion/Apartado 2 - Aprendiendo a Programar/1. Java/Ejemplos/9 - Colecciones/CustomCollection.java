public class CustomCollection {
    
    private Object datos[] = null;
    private int numValores;
    private static final int INITIAL_CAPACITY = 4;

    public CustomCollection(int capacidadInicial) {
        datos = new Object[capacidadInicial];
    }

    public CustomCollection() {
        datos = new Object[INITIAL_CAPACITY];
    }

    public void insert(Object elemento, int posicion) {
        if (numValores == datos.length) {
            Object auxuliar[] = datos;
            datos = new Object[datos.length * 2];

            for (int i = 0; i < numValores; i++) {
                datos[i] = auxuliar[i];
            }

            auxuliar = null;
        }
    }


    auxiliar[]
}
