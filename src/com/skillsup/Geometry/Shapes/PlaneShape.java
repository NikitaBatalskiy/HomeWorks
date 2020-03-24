//package com.skillsup.Geometry.Shapes;
//
//import com.skillsup.Geometry.Inerfaces.AreaMeasurable;
//import com.skillsup.Geometry.Inerfaces.PerimeterMeasurable;
//
//import java.util.List;
//
//public class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {
//
//    private double X;
//    private double Y;
//    private double P;
//    private double S;
//
//    public PlaneShape(List<double[]> vertices, double x, double y) {
//        super(vertices);
//        vertices.add(x);
//        vertices.add(y);
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//
//    @Override
//    public double getPerimetr() {
//        return 0;
//    }
//
//    class Triangle extends PlaneShape {
//
//        private double Z;
//
//        public Triangle(List<Double> vertices, double x, double y, double z) {
//            super(vertices, x, y);
//            Z = z;
//        }
//
//        @Override
//        public double getArea() {
//            double XY = 0;
//            return S = 0;
//        }
//
//        @Override
//        public double getPerimetr() {
//            return super.getPerimetr();
//        }
//    }
//
//    public class Rectangle extends PlaneShape {
//
//        public Rectangle(List<Double> vertices, double x, double y) {
//            super(vertices, x, y);
//        }
//
//        @Override
//        public double getArea() {
//            return super.getArea();
//        }
//
//        @Override
//        public double getPerimetr() {
//            double P = 2;
//            return P;
//        }
//    }
//
//    public class Circle extends PlaneShape{
//        public Circle(List<Double> vertices, double x, double y) {
//            super(vertices, x, y);
//        }
//
//        @Override
//        public double getArea() {
//            return super.getArea();
//        }
//
//        @Override
//        public double getPerimetr() {
//            return super.getPerimetr();
//        }
//    }
//}
