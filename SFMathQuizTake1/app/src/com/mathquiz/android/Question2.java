package com.mathquiz.android;

import java.util.Random;

public class Question2 {
    private int firstNumber1;
    private int secondNumber1;
    private int answer1;
    private int [] answerArray1;

    private int answerPosition1;

    private int upperLimit1;

    private String questionPhrase1;

    public Question2(int upperLimit){
        this.upperLimit1 = upperLimit;
        Random randomNumberMaker = new Random();

        this.firstNumber1 = randomNumberMaker.nextInt(upperLimit);
        this.secondNumber1 = randomNumberMaker.nextInt(upperLimit);
        this.answer1 = this.firstNumber1 * this.secondNumber1;
        this.questionPhrase1 = firstNumber1 + " * " + secondNumber1 + " = ";

        this.answerPosition1 = randomNumberMaker.nextInt(4);
        this.answerArray1 = new int[] {0,1,2,3};

        this.answerArray1[0] = answer1 + 1;
        this.answerArray1[1] = answer1 + 10;
        this.answerArray1[2] = answer1 - 5;
        this.answerArray1[3] = answer1 - 2;

        this.answerArray1 = shuffleArray(this.answerArray1);

        answerArray1[answerPosition1] = answer1;

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

    public int getFirstNumber1() {
        return firstNumber1;
    }

    public void setFirstNumber1(int firstNumber1) {
        this.firstNumber1 = firstNumber1;
    }

    public int getSecondNumber1() {
        return secondNumber1;
    }

    public void setSecondNumber1(int secondNumber1) {
        this.secondNumber1 = secondNumber1;
    }

    public int getAnswer1() {
        return answer1;
    }

    public void setAnswer1(int answer1) {
        this.answer1 = answer1;
    }

    public int[] getAnswerArray1() {
        return answerArray1;
    }

    public void setAnswerArray1(int[] answerArray1) {
        this.answerArray1 = answerArray1;
    }

    public int getAnswerPosition1() {
        return answerPosition1;
    }

    public void setAnswerPosition1(int answerPosition1) {
        this.answerPosition1 = answerPosition1;
    }

    public int getUpperLimit1() {
        return upperLimit1;
    }

    public void setUpperLimit1(int upperLimit1) {
        this.upperLimit1 = upperLimit1;
    }

    public String getQuestionPhrase1() {
        return questionPhrase1;
    }

    public void setQuestionPhrase1(String questionPhrase1) {
        this.questionPhrase1 = questionPhrase1;
    }

}
