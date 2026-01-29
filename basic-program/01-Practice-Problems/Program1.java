class Student {
    int rollNo = 101;
    String name = "Ram Sharma";
    double percentage = 71.89;
    char result = 'P';

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Roll No = " + s.rollNo);
        System.out.println("Name = " + s.name);
        System.out.println("Percentage Marks = " + s.percentage);
        System.out.println("Result = " + s.result);
    }
}
