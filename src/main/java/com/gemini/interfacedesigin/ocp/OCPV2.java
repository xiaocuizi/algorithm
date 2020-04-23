package com.gemini.interfacedesigin.ocp;

/**
 * 接口设计之开闭原则
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 14:35
 */
public class OCPV2 {

    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Circle());
        graphEditor.drawShape(new Rentangle());
    }


    static class GraphEditor {
        public void drawShape(Shape shape) {
            shape.drawShape();
        }
    }


    static abstract class Shape {

        int mtype;

        abstract void drawShape();
    }

    static class Circle extends Shape {
        public Circle() {
            super.mtype = 1;
        }

        @Override
        void drawShape() {
            System.out.println("绘制圆形");
        }
    }

    static class Rentangle extends Shape {
        public Rentangle() {
            super.mtype = 2;
        }

        @Override
        void drawShape() {
            System.out.println("绘制矩形");
        }
    }
}
