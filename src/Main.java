public class Main {
    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        myList.add("Привет мир!1");
        myList.add("Привет мир!2");
        myList.add("Привет мир!3");
        myList.add("Привет мир!4");
        myList.add("Привет мир!5");

        myList.remove("Привет мир!3");


        for (int i = 0; i < 5; i++) {
            System.out.println(myList.get(i));
        }

    }
}
