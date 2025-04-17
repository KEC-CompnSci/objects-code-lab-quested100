import java.util.Scanner;


public class Question {
    private String question;
    public int totalMarks;
    private String answer;
    private String studentAnswer;

    public Question(String question,int totalMarks, String answer){
        this.question = question;
        this.totalMarks = totalMarks;
        this.answer = answer;

    }
    public String AskQuestion(Scanner scanner){
        System.out.println(this.question + "("+ this.totalMarks + " marks)");
        this.studentAnswer = scanner.nextLine();
        return this.studentAnswer;
    }
    public int CheckAnswer(){
        if (this.studentAnswer.equals(this.answer)){
            return this.totalMarks;
        }
        else{
            return 0;
        }
    }
  
}