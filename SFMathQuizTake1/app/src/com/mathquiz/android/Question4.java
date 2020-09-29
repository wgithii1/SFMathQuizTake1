package com.mathquiz.android;

import java.util.Random;

public class Question4 {
    private int firstNumber3;
    private int secondNumber3;
    private int answer3;
    private int [] answerArray3;
    private int answerPosition3;

    private int upperLimit3;

    private String questionPhrase3;

    public Question4(int upperLimit){
        this.upperLimit3 = upperLimit;
        Random randomNumberMaker = new Random();

        //  this.firstNumber3 = randomNumberMaker.nextInt( upperLimit);
        //this.secondNumber3 = randomNumberMaker.nextInt( upperLimit);

        this.firstNumber3 = randomNumberMaker.nextInt(100/2) *2;
        this.secondNumber3 = randomNumberMaker.nextInt(100/2) *2;


        //  this.firstNumber3 = 0 + (upperLimit - 0) * randomNumberMaker.nextDouble();
        // this.secondNumber3 = 0 + (upperLimit - 0) * randomNumberMaker.nextDouble();


        this.answer3 = this.firstNumber3 / this.secondNumber3;
        this.questionPhrase3 = firstNumber3 + " / " + secondNumber3 + " = ";

        this.answerPosition3 = randomNumberMaker.nextInt(4);
        this.answerArray3 = new int[] {0,1,2,3};

        this.answerArray3[0] = answer3 + 1;
        this.answerArray3[1] = answer3 + 10;
        this.answerArray3[2] = answer3 - 5;
        this.answerArray3[3] = answer3 - 2;

        this.answerArray3 = shuffleArray(this.answerArray3);

        answerArray3[answerPosition3] = answer3;

    }

    private int [] shuffleArray(int[] array){
        int index;
        int temp;
        Random randomNumberGenerator = new Random();

        for( int i = array.length - 1; i > 0; i--){
            index = randomNumberGenerator.nextInt( i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public int getFirstNumber3() {
        return firstNumber3;
    }

    public void setFirstNumber3(int firstNumber3) {
        this.firstNumber3 = firstNumber3;
    }

    public int getSecondNumber3() {
        return secondNumber3;
    }

    public void setSecondNumber3(int secondNumber3) {
        this.secondNumber3 = secondNumber3;
    }

    public int getAnswer3() {
        return answer3;
    }

    public void setAnswer3(int answer3) {
        this.answer3 = answer3;
    }

    public int[] getAnswerArray3() {
        return answerArray3;
    }

    public void setAnswerArray3(int[] answerArray3) {
        this.answerArray3 = answerArray3;
    }

    public int getAnswerPosition3() {
        return answerPosition3;
    }

    public void setAnswerPosition3(int answerPosition3) {
        this.answerPosition3 = answerPosition3;
    }

    public int getUpperLimit3() {
        return upperLimit3;
    }

    public void setUpperLimit3(int upperLimit3) {
        this.upperLimit3 = upperLimit3;
    }

    public String getQuestionPhrase3() {
        return questionPhrase3;
    }

    public void setQuestionPhrase3(String questionPhrase3) {
        this.questionPhrase3 = questionPhrase3;
    }


}

