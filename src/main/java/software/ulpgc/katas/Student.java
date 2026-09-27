package software.ulpgc.katas;

public record Student(String firstName, String lastName) {
    public int gradePercentage(float grade, float maxGrade) {
        return Math.round(grade / maxGrade * 100);
    }
}
