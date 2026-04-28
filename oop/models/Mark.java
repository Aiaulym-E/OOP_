package models;
public class Mark {
    private double att1;
    private double att2;
    private double finalExam;

    public Mark(double att1, double att2, double finalExam) {
        this.att1 = att1;
        this.att2 = att2;
        this.finalExam = finalExam;
    }

    public double getTotal() {
        return att1 + att2 + finalExam;
    }

    public String getLetter() {
        double total = getTotal();

        if(total >= 90) return "A";
        if(total >= 80) return "B";
        if(total >= 70) return "C";
        if(total >= 60) return "D";

        return "F";
    }

    @Override
    public String toString() {
        return "Total: " + getTotal() + " Grade: " + getLetter();
    }
}