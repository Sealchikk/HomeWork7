public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public void putFood(int amount) {
        foodAmount += amount;
    }

    public void decreaseFood (int amount) {
        if (amount > foodAmount) {
            System.out.println("Cat can't eat");
        } else {
            foodAmount -= amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
