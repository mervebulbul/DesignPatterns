/*
Merve Bülbül
B211202350
Design Patterns
homework3
 */

/*
In this pattern, It is ordered by the user to make a choice
and what to do according to the selection.
I used template method.
Template method defines the steps to execute an algorithm
and it can provide default implementation that might be common for all or some of the subclasses.

 */
fun main(args: Array<String>) {

//Instances of concrete classes
    val cook=Cook();
    val order=Order();
    println("        Do you want to eat meal? Let's cook");
//Calling make functions of each concrete class
    cook.meal();
    println("         Don't you want to cook? Let's order");
    order.decide();
    order.ordering();
}