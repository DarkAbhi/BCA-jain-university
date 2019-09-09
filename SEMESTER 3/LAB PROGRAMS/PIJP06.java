package com.bca;

class College {
    static String course_name = "BCA";
    String subject1;
    String subject2;
    String subject3;

    College(String a, String b, String c) {
        this.subject1 = a;
        this.subject2 = b;
        this.subject3 = c;
    }

    void display() {
        System.out.println("Course: " + course_name);
        System.out.println("Subjects: " + subject1 + ", " + subject2 + ", " + subject3);
    }
}

public class PIJP06 {

    public static void main(String a[]) {
        College c1 = new College("Java", "C", "RDBMS");
        c1.display();
    }
}
