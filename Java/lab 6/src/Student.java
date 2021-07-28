package javalr6;

public class Student {
    private Sex sex;
    private String secondName;
    private int age;
    private int missedLessons;
    private double avarageMark;
    boolean scolarship;
    boolean army;

    class Scolarship {
        private final int MAX_MISSED_LESSONS = 10;
        private final double MIN_AVARAGE_MARK = 4.5;

        public void calculateScolarship() {
            scolarship = (missedLessons < MAX_MISSED_LESSONS) && (avarageMark >= MIN_AVARAGE_MARK);
        }
    }


    public Student(String secondName, int age, Sex sex, int missedLessons, double raiting) {
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
        this.missedLessons = missedLessons;
        this.avarageMark = raiting;

        class Army {
            public void checkGrassForPaint() {
                army = age >= 18 && sex == Sex.MAN;
            }
        }
        new Army().checkGrassForPaint();
        new Scolarship().calculateScolarship();
    }
    public void Data() {
        System.out.println("Second name: " + secondName + '\n' +
                "Age: " + age + '\n' +
                "Sex: " + sex + '\n' +
                "Missed lessons: " + missedLessons + '\n' +
                "Avarage mark: " + avarageMark + '\n' +
                secondName + " scholarship: " + scolarship + '\n' +
                secondName + " be able to paint the grass green: " + army);
    }
}
