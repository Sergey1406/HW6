public class HomeWorkApp {
    public void printThreeWords() {
        System.out.println("Orange" + '\n' + "Banana" + '\n' + "Apple");
    }

    public void checkSumSign() {
        int a = 3;
        int b = -4;

        if (a + b >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }

    }

    public void printColor() {
        int a = 101;

        if (a <= 0) {
            System.out.println("Червоний");
        } else if (a > 0 && a <= 100) {
            System.out.println("Жовтий");
        } else {
            System.out.println("Зелений");
        }

    }

    public void compareNumbers() {
        int a = 111111;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public boolean checkRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }


    public void isPositive(int a) {
        if (a >= 0) {
            System.out.println("Число позитивне");
        } else {
            System.out.println("Число негативне");
        }
    }

    public boolean checkSign(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }


    public void printWord(int a, String word) {
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }

    public boolean checkYear(int year) {
        boolean isLeap = false;

        if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
    }
}
