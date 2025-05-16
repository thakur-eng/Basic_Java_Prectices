class AllAreOne3 {
    public static void main(String[] args) {
        AllAreOne3 aa = new AllAreOne3();
        aa.calculate(30, 10);
       
    }

    public void calculate(int a, int b) {
        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + multi(a, b));
        System.out.println("Division: " + divide(a, b));
    }

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multi(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        if (b != 0) { // Check to avoid division by zero
            int result = a / b;
            return result;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}
