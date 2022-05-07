package com.ruochen.principles.demo2.after;

public class RectangleDemo {

    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        // 扩宽
        resize(r);
        // 打印
        printLengthAndWidth(r);
    }

    /**
     * 扩宽
     *
     * @param rectangle
     */
    public static void resize(Rectangle rectangle) {
        // 判断宽如果比长小，进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}
