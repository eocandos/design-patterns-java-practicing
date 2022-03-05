package com.eos.dpj.tutorialspoint.factory.factory;

import com.eos.dpj.tutorialspoint.factory.objects.Circle;
import com.eos.dpj.tutorialspoint.factory.objects.Rectangle;
import com.eos.dpj.tutorialspoint.factory.objects.Shape;
import com.eos.dpj.tutorialspoint.factory.objects.Square;

/***
 * STEP 3
 * Create a Factory to generate object of concrete class based on given information.
 */
public class ShapeFactory {

    // use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
