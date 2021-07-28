class Calculator {
    public static int a=10;// число 1
    public static int b=2;//число 2
    public static char actionMath='/';//математическое действие(+,-,*,/,^)
    public static int suma(int a, int b){//сложение
        return a+b;
    }
    public static int nesuma(int a, int b){//вычетание
        return a-b;
    }
    public static int supersuma(int a, int b){//умножение
        int c=0;
        for (int x=1; x<=b; x++){
            c+=a;
        }
        return c;
    }
    public static int supernesuma(int a, int b){//деление
        return a/b;
    }
    public static int degree(int a, int b){//число 1 в степени числа 2
        int c=1;
        for (int x=1; x<=b; x++){
            c*=a;
        }
        return c;
    }
    public static void main(String[] args){
        switch (actionMath){
            case '+' : System.out.println(suma(a,b));
                break;
            case '-' : System.out.println(nesuma(a,b));
                break;
            case '*' : System.out.println(supersuma(a,b));
                break;
            case '/' : System.out.println(supernesuma(a,b));
                break;
            case '^' : System.out.println(degree(a,b));
                break;
            default : System.out.println("Sorry(((");
        }
    }
}