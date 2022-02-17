public class MyArrayList implements MyList {
    public static final int MAX_SIZE = 100;
    String[] arrays;
    int size;

    public MyArrayList() {
        arrays = new String[size];
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
        String[] newArray = new String[size+1];
        newArray[size] = string;
        for (int i = 0; i < size; i++) {
            newArray[i] = arrays[i];
        }
        size++;
        arrays=newArray;
    }

    @Override
    public boolean remove(String var) {
        for (int i = 0; i < size; i++) {
            if (arrays[i].equals(var)) {
                int q = i;
                shiftFromTo(q);
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
    private void shiftFromTo(int index){
        for (int i = index; i < size-1; i++) {
            arrays[i]=arrays[i+1];
            }
//        arrays[size] = "понг";
        }
    }