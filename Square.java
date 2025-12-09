public class Square extends Rectangle // DO NOT REMOVE THIS INHERITANCE 
{
    /* This class represents a square. Squares have an X and Y
     * coordinate, and a single side length. Square inherits from
     * Rectangle. As before, the X and Y coordinates are the 
     * location of the bottom left corner of the square.
     * 
     * Fill in the methods below, and test your solutions
     * by running the unit tests in the SquareTest.java file.
     * 
     * NAME: <your name here>
     * CSID: <your csid here>
     * 
     * This class is worth 10 marks. 7 marks are assigned for 
     * the methods below, and an addition 3 marks require
     * the inheritance from Rectangle to be working correctly.
     */

    /* TO BE COMPLETED */
    // Declare any instance variables here (if necessary)
    // Ensure that they are private.
    private int x ;
    private int y;
    private int side_len;
    public Square(int x, int y, int side_len) 
    {
        // The constructor for Square
        // Initialize any instance variables here (if necessary) and
        // call the super constructor
        super(x, y, side_len, side_len);
    }
    
    /* TO BE COMPLETED */
    @Override
    public boolean equals(Object other)
    {
        if(this == other){
            return true;
        }
        if(other == null||this.getClass()!=other.getClass()){
            return false;
        }
        Rectangle c = (Rectangle) other;
        if(this.calculateArea()==c.calculateArea()){
            return true;
        }
        
            return false;
        /* Two squares are considered equal if they have the same area.
         * Similarly, a Square can be equal to a Rectangle if it has the
         * same area. For example, a 10x10 Square is equal to a 20x5 Rectangle.  
         * 
         * This method is worth 5 marks
         */

    }

    /* TO BE COMPLETED */
    @Override
    public String toString() 
    {
        /* String format for Square should include the side length. For example, 
         * if the Square has a side length of 6, the String representation
         * should be exactly:
         * "Square: 6x6"
         * 
         * This method is worth 2 marks.
         */

        return "Square: "+this.getHeight()+"x"+this.getWidth();
    }
}

