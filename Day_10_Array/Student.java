 
 public class Student {
    public static void main(String[] args) {
        int[] studentMarks = {35, 40, 55, 65, 75, 85, 33, 47, 59, 61};
        int minMark = 36;
        int thirdDivMark = 40;
        int secondDivMark = 60;

        int failedStudents = 0;
        int thirdDivStudents = 0;
        int secondDivStudents = 0;
        int firstDivStudents = 0;

        for (int mark : studentMarks) {
            if (mark < minMark) {
                failedStudents++;
            } else if (minMark <= mark && mark < thirdDivMark) {
                thirdDivStudents++;
            } else if (thirdDivMark <= mark && mark < secondDivMark) {
                secondDivStudents++;
            } else {
                firstDivStudents++;
            }
        }

        System.out.println("Failed students: " + failedStudents);
        System.out.println("Third Division students: " + thirdDivStudents);
        System.out.println("Second Division students: " + secondDivStudents);
        System.out.println("First Division students: " + firstDivStudents);
    }
}
