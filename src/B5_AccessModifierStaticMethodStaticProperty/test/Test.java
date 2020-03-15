package B5_AccessModifierStaticMethodStaticProperty.test;

import B5_AccessModifierStaticMethodStaticProperty.AccessModifier.Circle;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
    }
}
