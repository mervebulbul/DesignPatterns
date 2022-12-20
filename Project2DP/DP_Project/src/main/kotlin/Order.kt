class Order : Meal() {
    override fun decide() {
        println("Deciding a meal");
    }

    override fun ordering() {
        println("Find an online shopping platform");
        println("Add your chosen food to cart");
        println("If there is a coupon ,add.");
        println("Confirm order");
        println("Wait..");
    }


}