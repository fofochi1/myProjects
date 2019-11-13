import java.util.stream.DoubleStream;

public class AverageGrade {
    private double sum;
    private double average;
    public void setAverageGrade(double[] grade){
        sum = DoubleStream.of(grade).sum();
        this.average = sum/grade.length;
    }
    public double getAverageGrade() {
        return average;
    }
}
