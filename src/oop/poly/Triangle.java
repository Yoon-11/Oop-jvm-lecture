package oop.poly;

public class Triangle implements Shape{
    @Override
    public void render() {
        for (int i = 1; i < 6; i++) {
            String star = "*";
            String result = star.repeat(i);
            System.out.println(result);
        }
    }
}
