public class MyArrayList implements MyList {
    public static final int MAX_SIZE = 100;
    String[] arrays;
    int size;

    public MyArrayList() {
        arrays = new String[MAX_SIZE];
        size = 0;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public int size() {
        return size;

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // пустой чи не
    @Override
    public boolean contains(String var) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].equals(var)) {
                return true;
            }
        }
        return false;
    }

    // проверяет есть ли var
    @Override
    public void add(String string) {
        arrays[size] = string;
        size++;

    }

    @Override
    public boolean remove(String var) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].equals(var)) {
                arrays[i] = null;
            }
        }
        return false;
    }

    @Override
    public String get(int i) {
        if (i >= MAX_SIZE) {
            return null;
        }
        return arrays[i];
    }
}