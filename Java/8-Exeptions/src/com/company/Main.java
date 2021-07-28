package com.company;

public class Main {

    static class Math{
        int a;
        int b;

        public Math(int a_, int b_){
            a = a_;
            b = b_;
        }
        //1
        public void divOnZero(){
            a =  a / 0;
        }

        //2,3,4
        public void divOnZeroTry(int exp){
            int c;
            try {
                if(exp == 1)
                    c = a / 0;
                else
                    Integer.parseInt("aaa");
            }
            catch (ArithmeticException e){
                System.out.println(e.getMessage());
                method3();
            }
            catch (NumberFormatException e){
                System.out.println(e.getMessage());
                method3();
            }
        }

        //5
        public Throwable throwableRet(){
            try {
                int n = 2 / 0;
            }
            catch (Throwable e){
                System.out.println(e.getMessage());
                return e;
            }
            return new Throwable();
        }

        //6
        public void throwable(){
                int n = 2 / 0;
        }

        //3
        public static void method3()
        {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            for (StackTraceElement element : stackTraceElements)
            {
                System.out.println(element.getMethodName());
            }
        }

    }

    public static void main(String[] args) {
	Math a = new Math(2, 2);

    //1
	//a.divOnZero();

    //2,3,4
	//a.divOnZeroTry(2);

        //6
        try {
            a.throwable();
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            a.method3();
        }
    }
}
