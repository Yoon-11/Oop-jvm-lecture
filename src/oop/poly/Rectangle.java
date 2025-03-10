package oop.poly;

public class Rectangle implements Shape{

    @Override
    public void render() {
        int size = 5;
        int layer = 5;
        for (int i = 0; i < layer; i++) {
            String star = "*";
            String repeatStar = star.repeat(size);
            System.out.println(repeatStar);
        }
    }
}
