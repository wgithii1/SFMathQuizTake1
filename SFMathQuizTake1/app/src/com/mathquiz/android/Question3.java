package com.mathquiz.android;

import java.util.Random;

public class Question3 {

    private int firstNumber2;
    private int secondNumber2;
    private int answer2;
    private int [] answerArray2;
    private int answerPosition2;

    private int upperLimit2;

    private String questionPhrase2;

    public Question3(int upperLimit){
        this.upperLimit2 = upperLimit;
        Random randomNumberMaker = new Random();

        this.firstNumber2 = randomNumberMaker.nextInt(upperLimit);
        this.secondNumber2 = randomNumberMaker.nextInt(upperLimit);
        this.answer2 = this.firstNumber2 - this.secondNumber2;
        this.questionPhrase2 = firstNumber2 + " - " + secondNumber2 + " = ";

        this.answerPosition2 = randomNumberMaker.nextInt(4);
        this.answerArray2 = new int[] {0,1,2,3};

        this.answerArray2[0] = answer2 + 1;
        this.answerArray2[1] = answer2 + 10;
        this.answerArray2[2] = answer2 - 5;
        this.answerArray2[3] = answer2 - 2;

        this.answerArray2 = shuffleArray(this.answerArray2);

        answerArray2[answerPosition2] = answer2;

    }

    private int [] shuffleArray(int[] array){
        int index, temp;
        Random randomNumberGenerator = new Random();

        for( int i = array.length - 1; i > 0; i--){
            index = randomNumberGenerator.nextInt( i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public int getFirstNumber2() {
        return firstNumber2;
    }

    public void setFirstNumber2(int firstNumber2) {
        this.firstNumber2 = firstNumber2;
    }

    public int getSecondNumber2() {
        return secondNumber2;
    }

    public void setSecondNumber2(int secondNumber2) {
        this.secondNumber2 = secondNumber2;
    }

    public int getAnswer2() {
        return answer2;
    }

    public void setAnswer2(int answer2) {
        this.answer2 = answer2;
    }

    public int[] getAnswerArray2() {
        return answerArray2;
    }

    public void setAnswerArray2(int[] answerArray2) {
        this.answerArray2 = answerArray2;
    }

    public int getAnswerPosition2() {
        return answerPosition2;
    }

    public void setAnswerPosition2(int answerPosition2) {
        this.answerPosition2 = answerPosition2;
    }

    public int getUpperLimit2() {
        return upperLimit2;
    }

    public void setUpperLimit2(int upperLimit2) {
        this.upperLimit2 = upperLimit2;
    }

    public String getQuestionPhrase2() {
        return questionPhrase2;
    }

    public void setQuestionPhrase2(String questionPhrase2) {
        this.questionPhrase2 = questionPhrase2;
    }
}
