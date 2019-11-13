public class MaxGrade extends AverageGrade {
    private double maxGrade;

    public void setMaxGrade(double[] grade) {
        maxGrade = grade[0];
        for (int i = 0; i < grade.length; i++){
            if(grade[i] > maxGrade){
                this.maxGrade = grade[i];
            }
        }
    }
    public double getMaxGrade(){
        return maxGrade;
    }
}
