public class Rectangle implements Comparable<Rectangle>
{
     /* This class represents a rectangle. Rectangles have
     * an X and Y coordinate, as well as a width and height.
     * The X and Y coordinate correspond to the location of
     * the bottom left corner of the rectangle.
     * 
     * Fill in the methods below, and test your solutions
     * by running the unit tests in the RectangleTest.java
     * file.
     * 
     * This class is worth 20 marks.
     * 
     * NAME: <your name here>
     * CSID: <your csid here>
     */

    /* TO BE COMPLETED */
    // Declare instance variables here (if necessary). 
    // Ensure they are all private.

    /* TO BE COMPLETED */
    private int x;
    private int y;
    private int width;
    private int height;


    public Rectangle(int x, int y, int width, int height) 
    {
        this.height=height;
        this.width = width;
        this.x=x;
        this.y=y;
        // The constructor for Rectangle
        // Initialize any instance variables here (if necessary)
    }

    /* COMPLETE ALL GETTERS BELOW */
    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    /* TO BE COMPLETED */
    public int calculateArea() 
    {
        // Calculate and return the area of the Rectangle
        // This method is worth 2 marks

        return width*height;
    }

    /* TO BE COMPLETED */
    public int calculatePerimeter() 
    {
        // Calculate and return the perimeter of the Rectangle
        // This method is worth 2 marks
        return (width*2)+(height*2);
    }

    /* TO BE COMPLETED */
    public Rectangle translate(int x, int y)
    {
        /* This method creates and returns a new Rectangle whose bottom
         * left corner has been translated by x and y.
         * For example, if a rectangle with coordinates 3,5 was translated
         * by -8,4 then the coordinates of the new Rectangle would be -5,9.
         * Note that translating should not change the width or height.  
         * In addition, the "this" Rectangle should not be changed by
         * this method. Note that this method should not
         * change any of the instance variables of the "this" object.
         * 
         * This method is worth 4 marks.
         */
        return new Rectangle(this.x + x, this.y + y, this.width, this.height);

    }

    /* TO BE COMPLETED */
    @Override
    public boolean equals(Object other)
    {
        /* Two Rectangles are considered equal if they have the same area.
         * Similarly, a Rectangle can be equal to a Square if it has the
         * same area. For example, a 10x10 Square is equal to a 20x5 Rectangle.  
         * 
         * Note that the x, y coordinates do not matter for equality.
         * 
         * This method is worth 5 marks
         */
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
    }

    /* TO BE COMPLETED */
    @Override
    public int compareTo(Rectangle other)
    {
        /* Rectangles should be sorted by area. One Rectangle is less than
         * another if it has a smaller area. 
         * If two Rectangles have the same area, use the perimeter instead. 
         * If two Rectangles have the same area and perimeter, they are equal.
         * 
         * This method is worth 4 marks.
         */
       

    if (this.calculateArea()!=other.calculateArea()){
        return this.calculateArea()-other.calculateArea();
    }
    return this.calculatePerimeter()-other.calculatePerimeter();

    }

    /* TO BE COMPLETED */
    @Override
    public String toString() 
    {
        /* String format for Rectangle should include the dimensions, and the
         * smaller of the two dimensions should come first. For example, if the
         * Rectangle has a width of 8 and a height of 4, the String representation
         * should be exactly:
         * "Rectangle: 4x8"
         * 
         * This method is worth 3 marks.
         */ 
        if (this.getHeight()>this.getWidth()){
            return "Rectangle: "+ ""+ this.getWidth()+"x"+ this.getHeight();

        }
       return "Rectangle: " +""+this.getHeight()+ "x"+ this.getWidth();
    }
}