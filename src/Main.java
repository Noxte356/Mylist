public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add("Привет мир!");
        myList.add("Привет мир!2");
        myList.add("Привет мир!2");
        myList.add("Привет мир!3");
        myList.add("Привет мир!2");
        myList.add("Привет мир!2");
        myList.add("Привет мир!2");
        System.out.println(myList.contains("Привет мир!"));
    }
}
