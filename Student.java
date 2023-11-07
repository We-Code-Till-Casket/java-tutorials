public class Student {
    private String name;

    private Double totalQuizScore;

    private Integer numOfQuizzes;

    private Student(String name, Double totalQuizScore, Integer numOfQuizzes){
        this.name = name;
        this.totalQuizScore = totalQuizScore;
        this.numOfQuizzes = numOfQuizzes;
    }

    public String getName(){
        return name;
    }

    public Integer addQuiz( Integer quizNum){
        numOfQuizzes +=  quizNum;
        return numOfQuizzes;
    }

    public Double getTotalScore(){
        return  totalQuizScore;
    }

    public Double getAverageScore(Double totalQuizScore, Integer numOfQuizzes){
        return  totalQuizScore / numOfQuizzes;
    }


}
