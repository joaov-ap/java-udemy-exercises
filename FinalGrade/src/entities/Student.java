package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double finalGrade;

    public double calcFinalGrade() {
        return this.finalGrade = grade1 + grade2 + grade3;
    }

    public double missingPoints() {
        return 60 - this.finalGrade;
    }

    public String toString() {
        if (calcFinalGrade() < 60) {
            return "FINAL GRADE = " + String.format("%.2f", calcFinalGrade()) + "\nFAILED \nMISSING " + String.format("%.2f", missingPoints()) + " POINTS";
        } else {
            return "FINAL GRADE = " + String.format("%.2f", calcFinalGrade()) + "\nPASS";
        }
    }
}
