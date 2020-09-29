package com.mathquiz.android;

import java.util.ArrayList;
import java.util.List;

public class Game3 {
    private List<Question3> questions2;
    private int numberCorrect2;
    private int numberIncorrect2;
    private int totalQuestions2;
    private int score2;
    private Question3 currentQuestion2;

    public Game3(){
        numberCorrect2 =0;
        numberIncorrect2 =0;
        totalQuestions2 =0;
        score2 =0;
        currentQuestion2 = new Question3(10);
        questions2 = new ArrayList<Question3>();
    }
    public void makeNewQuestion(){
        currentQuestion2 = new Question3(totalQuestions2 * 2 + 5);
        totalQuestions2++;
        questions2.add(currentQuestion2);
    }

    public boolean checkAnswer(int submittedAnswer){
        boolean isCorrect;
        if(currentQuestion2.getAnswer2() == submittedAnswer){
            numberCorrect2++;
            isCorrect = true;

        }
        else{
            numberIncorrect2++;
            isCorrect = false;
        }
        score2 = numberCorrect2 * 10 - numberIncorrect2 * 30;
        return isCorrect;
    }

    public List<Question3> getQuestions2() {
        return questions2;
    }

    public void setQuestions2(List<Question3> questions2) {
        this.questions2 = questions2;
    }

    public int getNumberCorrect2() {
        return numberCorrect2;
    }

    public void setNumberCorrect2(int numberCorrect2) {
        this.numberCorrect2 = numberCorrect2;
    }

    public int getNumberIncorrect2() {
        return numberIncorrect2;
    }

    public void setNumberIncorrect2(int numberIncorrect2) {
        this.numberIncorrect2 = numberIncorrect2;
    }

    public int getTotalQuestions2() {
        return totalQuestions2;
    }

    public void setTotalQuestions2(int totalQuestions2) {
        this.totalQuestions2 = totalQuestions2;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }

    public Question3 getCurrentQuestion2() {
        return currentQuestion2;
    }

    public void setCurrentQuestion2(Question3 currentQuestion2) {
        this.currentQuestion2 = currentQuestion2;
    }

}
