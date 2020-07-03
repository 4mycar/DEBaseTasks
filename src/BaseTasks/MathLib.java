package BaseTasks;

import static BaseTasks.MathLib.PhysicsConstant.G;

public class MathLib {

    public MathLib(){
        System.out.println(getDistanceBySpeedAndDegree(90,30));
        System.out.println(getDistanceBySpeedAndRadian(30,1));
        System.out.println(getDistanceByAuto(30,40,2,1));
        System.out.println(isPointInsideFigure(-3,1));
        System.out.println(getMathValue(0));
    }

    public enum PhysicsConstant{
        G(9.81);
        private double val;
        PhysicsConstant(double val){
            this.val=val;
        }
    }

        //Стрельба из гаубицы. Дан угол возвышения ствола а и начальная скорость полёта снаряда. v км/ч.
        // Вычислить расстояние полёта снаряда. Реализовать решения для угла в градусах и в радианах.
    public static double getDistanceBySpeedAndDegree(double speed, double degree) {
        return Math.pow(speed,2) * Math.sin(Math.toRadians(2*degree)) / G.val;
    }

    public static double getDistanceBySpeedAndRadian(double speed, double rad) {
        return Math.pow(speed,2) * Math.sin(2*rad) / G.val;
    }

    //Скорость первого автомобиля v1 км/ч, второго — v2 км/ч, расстояние между ними s км.
    // Какое расстояние будет между ними через t ч, если автомобили 	движутся в разные стороны?
    public static double getDistanceByAuto(int v1, int v2, double s, double t) {
        return (v1 + v2) * t + s;
    }

    //Записать логическое выражение, принимающее значение 1, если точка лежит внутри заштрихованной области, иначе — 0.
    public static boolean isPointInsideFigure(int x, int y) {
        return y<=Math.abs(x) && y>=Math.abs(1.5*x)-1;
    }

    public static double getMathValue(int x) {
        return 6*Math.log(Math.sqrt(Math.pow(Math.E,x+1)+2*Math.pow(Math.E,x)*Math.cos(x)))/Math.log(x-Math.pow(Math.E,x+1)*Math.sin(x))+
                + Math.abs(Math.cos(x)/Math.pow(Math.E,Math.sin(x)));

    }



}
