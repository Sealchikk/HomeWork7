public class Test {

    public static void main(String[] args) {
        Cat[] cat = new Cat[5];
        Bowl bowl = new Bowl(61);
        cat[0] = new Cat("Barsik", 10);
        cat[1] = new Cat("Murzik", 15);
        cat[2] = new Cat("Pushistik", 11);
        cat[3] = new Cat("Chester", 15);
        cat[4] = new Cat("Chuan", 20);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl);
            cat[i].isSatiety();
        }
    }

}
