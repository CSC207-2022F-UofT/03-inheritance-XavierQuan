/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     * TODO: Create the following private instance variables
     *       - a String named color
     *       - an int named numberOfContents
     *       - an int named capacity
     *       - an array of Strings named contents
     */
    private String color;
    private int numberOfContents = 0;
    private int capacity;
    private String[] contents = {};




    /*
     * TODO: Create a constructor that takes two arguments:
     *       - a String representing the Bag's colour
     *       - an int representing the Bag's capacity
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String a, int b){
        this.color = a;
        this.capacity = b;
    }




    /*
     * TODO: Create a variety of 'getter' functions.
     *       These should be named:
     *           - getColor
     *           - getNumberOfContents
     *           - getCapacity
     */
    public String getColor(){
        return this.color;
    }

    public int getNumberOfContents(){
        return this.numberOfContents;
    }

    public int getCapacity(){
        return this.capacity;
    }




    /*
     * TODO: Create a setter function called setColor which sets the
     *       color of this bag to the given color.
     */
    public void setColor(String c){
        this.color = c;
    }





    /*
     * TODO: Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public Boolean addItem(String item){
        if (this.numberOfContents < this.capacity){
            String[] ary1 = new String[this.contents.length + 1];
            for (int i = 0; i < this.contents.length; i++){
                ary1[i] = this.contents[i];
            }
            ary1[this.contents.length] = item;
            this.contents = ary1;
            this.numberOfContents = ary1.length;
            return true;
        }
        else{
            return false;
        }
    }





    /**
     * TODO: Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem(){
        String[] ary2 = new String[this.contents.length - 1];
        for (int i = 0; i < this.contents.length - 1; i++){
            ary2[i] = this.contents[i];
        }
        String pop = this.contents[this.contents.length - 1];
        this.contents = ary2;
        this.numberOfContents -= 1;
        return pop;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        // TODO: Implement this method.
        this.capacity += n;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}