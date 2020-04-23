package com.gemini.interfacedesigin.ocp;

/**
 * 接口设计之开闭原则
 * <p>
 * 对扩展开放（对提供方），对修改关闭（对使用方）
 *
 * @author xiaocuizi
 * @since 0.0.1 2020/4/20 14:35
 */
public class OCP {

    public static void main(String[] args) {
        GraphEditor graphEditor = new GraphEditor();
        graphEditor.drawShape(new Circle());
        graphEditor.drawShape(new Rentangle());
    }


    static class GraphEditor {
        public void drawShape(Shape shape) {
            // 这里判断有问题？
            if (shape.mtype == 1) {
                drawRectangle(shape);
            } else if (shape.mtype == 2) {
                drawCircle(shape);
            }
        }

        private void drawCircle(Shape shape) {
            System.out.println("绘制圆形");
        }

        private void drawRectangle(Shape shape) {
            System.out.println("绘制矩形");
        }

    }


    static class Shape {
        int mtype;
    }

    static class Circle extends Shape {
        public Circle() {
            super.mtype = 1;
        }
    }

    static class Rentangle extends Shape {
        public Rentangle() {
            super.mtype = 2;
        }
    }
}
