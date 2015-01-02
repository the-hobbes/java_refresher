// BlueJ project: lesson2/touchingRectangles
//
// You need to construct and draw two rectangles for this quiz.
//
// Both rectangles have width 20 and height 30. The first rectangle
// has top left corner at (60, 90). The bottom right corner of the 
// first rectangle should be the top left corner of the second 
// rectangle. 

public class RectangleDemo
{
    public static void main(String[] args)
    {
        // TODO: Construct and draw the rectangles
        double width = 20.0;
        double height = 30.0;

        Rectangle rec_1 = new Rectangle(60.0, 90.0, width, height);
        Rectangle rec_2 = new Rectangle(60.0 + width, 90.0 + height, width, height);

        rec_1.draw();
        rec_2.draw();
    }
}
