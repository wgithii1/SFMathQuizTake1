package com.mathquiz.android;

import java.util.ArrayList;
import java.util.List;

public class Game4 {
    private List<Question4> questions3;
    private int numberCorrect3;
    private int numberIncorrect3;
    private int totalQuestions3;
    private int score3;
    private Question4 currentQuestion3;

    public Game4(){
        numberCorrect3 =0;
        numberIncorrect3 =0;
        totalQuestions3 =0;
        score3 =0;
        currentQuestion3 = new Question4(10);
        questions3 = new ArrayList<Question4>();
    }
    public void makeNewQuestion(){
        currentQuestion3 = new Question4((int) (totalQuestions3 * 2 + 5));
        totalQuestions3++;
        questions3.add(currentQuestion3);
    }

    public boolean checkAnswer(int submittedAnswer){
        boolean isCorrect;
        if(currentQuestion3.getAnswer3() == submittedAnswer){
            numberCorrect3++;
            isCorrect = true;

        }
        else{
            numberIncorrect3++;
            isCorrect = false;
        }
        score3 = numberCorrect3 * 10 - numberIncorrect3 * 30;
        return isCorrect;
    }

    public List<Question4> getQuestions3() {
        return questions3;
    }

    public void setQuestions3(List<Question4> questions3) {
        this.questions3 = questions3;
    }

    public int getNumberCorrect3() {
        return numberCorrect3;
    }

    public void setNumberCorrect3(int numberCorrect3) {
        this.numberCorrect3 = numberCorrect3;
    }

    public int getNumberIncorrect3() {
        return numberIncorrect3;
    }

    public void setNumberIncorrect3(int numberIncorrect3) {
        this.numberIncorrect3 = numberIncorrect3;
    }

    public int getTotalQuestions3() {
        return totalQuestions3;
    }

    public void setTotalQuestions3(int totalQuestions3) {
        this.totalQuestions3 = totalQuestions3;
    }

    public int getScore3() {
        return score3;
    }

    public void setScore3(int score3) {
        this.score3 = score3;
    }

    public Question4 getCurrentQuestion3() {
        return currentQuestion3;
    }

    public void setCurrentQuestion3(Question4 currentQuestion3) {
        this.currentQuestion3 = currentQuestion3;
    }



}

