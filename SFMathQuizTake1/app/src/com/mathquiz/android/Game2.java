package com.mathquiz.android;

import java.util.ArrayList;
import java.util.List;

public class Game2 {
    private List<Question2> questions1;
    private int numberCorrect1;
    private int numberIncorrect1;
    private int totalQuestions1;
    private int score1;
    private Question2 currentQuestion1;

    public Game2(){
        numberCorrect1 =0;
        numberIncorrect1 =0;
        totalQuestions1 =0;
        score1 =0;
        currentQuestion1 = new Question2(10);
        questions1 = new ArrayList<Question2>();
    }
    public void makeNewQuestion(){
        currentQuestion1 = new Question2(totalQuestions1 * 2 + 5);
        totalQuestions1++;
        questions1.add(currentQuestion1);
    }

    public boolean checkAnswer(int submittedAnswer){
        boolean isCorrect;
        if(currentQuestion1.getAnswer1() == submittedAnswer){
            numberCorrect1++;
            isCorrect = true;

        }
        else{
            numberIncorrect1++;
            isCorrect = false;
        }
        score1 = numberCorrect1 * 10 - numberIncorrect1 * 30;
        return isCorrect;
    }

    public List<Question2> getQuestions1() {
        return questions1;
    }

    public void setQuestions1(List<Question2> questions1) {
        this.questions1 = questions1;
    }

    public int getNumberCorrect1() {
        return numberCorrect1;
    }

    public void setNumberCorrect1(int numberCorrect1) {
        this.numberCorrect1 = numberCorrect1;
    }

    public int getNumberIncorrect1() {
        return numberIncorrect1;
    }

    public void setNumberIncorrect1(int numberIncorrect1) {
        this.numberIncorrect1 = numberIncorrect1;
    }

    public int getTotalQuestions1() {
        return totalQuestions1;
    }

    public void setTotalQuestions1(int totalQuestions1) {
        this.totalQuestions1 = totalQuestions1;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public Question2 getCurrentQuestion1() {
        return currentQuestion1;
    }

    public void setCurrentQuestion1(Question2 currentQuestion1) {
        this.currentQuestion1 = currentQuestion1;
    }
}
