abstract class Meal {
    fun meal() {
        decide();
        cook();
        ordering();
    }

    open fun cook() {
        println("cook");
    }
    open fun ordering(){
    }
    open fun decide() {
        println("Select a meal.");
    }
}