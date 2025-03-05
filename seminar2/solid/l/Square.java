package seminar2.solid.l;


public class Square extends  Rectangle{

    public void setDimension(int val) {
        super.setWidth(val);
        super.setHeight(val);
    }

	// public void setWidth(int val) {
	// 	super.setWidth(val);
	// 	super.setHeight(val);
		
	// }
	// public void setHeight(int val) {
	// 	super.setWidth(val);
	// 	super.setHeight(val);
		
	// }
	
}
/*Square is behaviorally not a correct substitution for Rectangle.*/
/*A Square does not comply with the behavior of a rectangle: 
 * Changing the height/width of a square behaves differently from changing the height/width of a rectangle.*/
 