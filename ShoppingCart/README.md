# Programming Challenge : Shopping Cart (from CSAwesome)

The code contains a class called ShoppingCart that simulates a grocery store or an online store’s shopping cart. It has an ArrayList called order that you can use to add Items to the shopping cart. The Item class keeps track of the name and the price of each Item. If you run the code, you will see that it adds 2 items to the cart and then prints out the total order.

In this challenge, you will add a new class called DiscountedItem that extends the Item class. The ArrayList of Item will still work since it can hold the subclasses of Item too! The ShoppingCart printOrder method will work with Item and DiscountedItem but note that it has an if statement that treats DiscountedItem differently.

In the DiscountedItem subclass,

* Add an instance variable for the discount amount.
* Add constructors that call the super constructor Item.
* Add get/set methods for discount. The get method is given below but you should modify it.
* Add a toString method that returns a string that includes a call to the super toString method that will print out the price as well as the discount amount using the super.valueToString() method to format it. You could put the discount in parentheses with a minus sign in front of it like “(- $.50)”.
* Uncomment the code in the main method to test adding DiscountedItems to the cart.
