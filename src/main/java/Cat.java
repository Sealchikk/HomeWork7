public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }

    public void eat(Bowl bowl) {
        if (bowl.getFoodAmount() > appetite && !satiety) {
            bowl.decreaseFood(appetite);
            satiety = true;
        } else {
            System.out.printf("%s does not want to eat from this blow\n", name);
        }
    }

    public void isSatiety() {
        if (satiety) {
            System.out.printf("%s is full\n", name);
        } else  {
            System.out.printf("%s is hungry\n", name);
        }
    }
}
