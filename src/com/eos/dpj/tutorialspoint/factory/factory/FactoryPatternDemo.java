package com.eos.dpj.tutorialspoint.factory.factory;

import com.eos.dpj.tutorialspoint.factory.objects.Shape;

/***
 * STEP 4
 * Use the Factory to get object of concrete class by passing an information such as type.
 * */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        /*** Shape Factory instance */
        ShapeFactory shapeFactory = new ShapeFactory();

        /*** Object Construction (CIRCLE)  */
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        /*** Object Construction (RECTANGLE)  */
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        /*** Object Construction (SQUARE)  */
        // ....

    }

}
