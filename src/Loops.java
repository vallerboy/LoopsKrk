public class Loops {
    public static void main(String[] args) {
        int age = 0;


        for (int i = 0; i < 10; i = i + 1) {
            //     System.out.println("Witaj " + i);

        }

        while (age++ < 20) {
            System.out.println(age);
        }

        do{
            System.out.println(age);
        }while (age++ < 40);


        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
        }

    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday && speed<=65){
            return 0;
        } else if(speed >=60 && speed <=85 ){
            return 1;
        } else{
            return 2;
        }
    }
}
