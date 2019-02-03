package Enumerations;

import java.util.Random;

/**
 * Answer
 */
public class Answer {
    public static void main(String[] args) {
        Question newQuestion = new Question();
        AskMe.answer(newQuestion.ask());
        AskMe.answer(newQuestion.ask());
        AskMe.answer(newQuestion.ask());
        AskMe.answer(newQuestion.ask());
    }
}
class Question{
    Random rand = new Random();
    AnswerChoices ask(){
        int prob = (int) (100* rand.nextDouble());
        if(prob <15)
            return AnswerChoices.MAYBE;
        else if(prob < 30)
            return AnswerChoices.NO;
        else if(prob<60)
            return AnswerChoices.YES;
        else if(prob <75)
            return AnswerChoices.LATER;
        else if(prob<98)
            return AnswerChoices.SOON;
        else
            return AnswerChoices.NEVER;
    }
}

class AskMe{
    static void answer(AnswerChoices result){
        switch (result) {
            case NO:
                System.out.println("NO");
                break;
            case YES:
                System.out.println("YES");
                break;
            case MAYBE:
                System.out.println("MAYBE");
            case LATER:
                System.out.println("LATER");
            case SOON:
                System.out.println("SOON");
            case NEVER:
                System.out.println("NEVER");
        
            default:
                break;
        }
    }
}
enum AnswerChoices{
    NO, YES, MAYBE, LATER, SOON, NEVER
}