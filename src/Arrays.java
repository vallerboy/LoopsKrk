public class Arrays {
    public static void main(String[] args) {

        String[] names = new String[10];
        names[0] = "Kamil";
        names[10] = "Ela";

        String[] names1 = {"Oskar", "test",  "hej"};

        System.out.println(names1.length);
        System.out.println(names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        //==
        for(String name : names){
            System.out.println(name);
        }
    }
}
