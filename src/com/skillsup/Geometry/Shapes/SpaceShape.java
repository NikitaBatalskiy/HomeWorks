//package com.skillsup.Geometry.Shapes;
//
//import com.skillsup.Geometry.Inerfaces.AreaMeasurable;
//import com.skillsup.Geometry.Inerfaces.VolumeMeasurable;
//
//import java.lang.reflect.Array;
//import java.util.List;
//
//public class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
//
//    private double Xa, Xb;
//    private double Ya, Yb;
//    private double Za, Zb;
//    private double[] X = {Xa, Xb};
//    private double[] Y = {Ya, Yb};
//    private double[] Z = {Za, Zb};
//    private double S;
//    private double V;
//
//    public double getXa() {
//        return Xa;
//    }
//
//    public double getXb() {
//        return Xb;
//    }
//
//    public double getYa() {
//        return Ya;
//    }
//
//    public double getYb() {
//        return Yb;
//    }
//
//    public double getZa() {
//        return Za;
//    }
//
//    public double getZb() {
//        return Zb;
//    }
//
//    public SpaceShape(List<double[]> vertices, double xa, double xb, double ya, double yb, double za, double zb) {
//        super(vertices);
//        Xa = xa;
//        Xb = xb;
//        Ya = ya;
//        Yb = yb;
//        Za = za;
//        Zb = zb;
//    }
//
//    @Override
//    public double getArea() {
//        return S = 0;
//    }
//
//    @Override
//    public double getVolume() {
//        return 0;
//    }
//
//    public class Square_Pyramid extends SpaceShape {
//
//        public Square_Pyramid(List<double[]> vertices, double xa, double xb, double ya, double yb, double za, double zb) {
//            super(vertices, xa, xb, ya, yb, za, zb);
//            vertices.add(super.X);
//            vertices.add(super.Y);
//            vertices.add(super.Z);
//        }
//
//        @Override
//        public double getArea() {
//            return super.getArea();
//        }
//
//        @Override
//        public double getVolume() {
//            return super.getVolume();
//        }
//    }
//
//    public static class Cuboid extends SpaceShape {
//
//        public Cuboid(List<double[]> vertices, double xa, double xb, double ya, double yb, double za, double zb) {
//            super(vertices, xa, xb, ya, yb, za, zb);
//            vertices.add(super.X);
//            vertices.add(super.Y);
//            vertices.add(super.Z);
//        }
//
//        @Override
//        public double getArea() {
//            return super.getArea();
//        }
//
//        @Override
//        public double getVolume() {
//            return super.getVolume();
//        }
//    }
//
//    public class Sphere extends SpaceShape {
//
//        public Sphere(List<double[]> vertices, double xa, double xb, double ya, double yb, double za, double zb) {
//            super(vertices, xa, xb, ya, yb, za, zb);
//            vertices.add(super.X);
//            vertices.add(super.Y);
//            vertices.add(super.Z);
//        }
//
//        @Override
//        public double getArea() {
//            return super.getArea();
//        }
//
//        @Override
//        public double getVolume() {
//            return super.getVolume();
//        }
//    }
//}
