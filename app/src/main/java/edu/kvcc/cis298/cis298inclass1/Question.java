package edu.kvcc.cis298.cis298inclass1;

/**
 * Created by rpeck0914 on 9/28/2015.
 */
public class Question {
    //Class level variable to hold the question text
    //In order to get a string from strings.xml, we need
    //and integer as the reference value.
    private int mTextResId;
    //Integer to represent the integer id of the correct resource
    private int mCorrectAnswerResId;
    //Integer array to hold the resource ids of the choices for the question
    private int[] mChoiceResId;

    //Constructor that accepts 3 parameters. The string id,
    //and the int correct answer
    public Question(int textResId, int correctAnswerResId, int[] choiceResId) {
        //Assign the passed in ones to the class level ones.
        mTextResId = textResId;
        mCorrectAnswerResId = correctAnswerResId;
        mChoiceResId = choiceResId;
    }

    public int[] getmChoiceResId() {
        return mChoiceResId;
    }

    public void setmChoiceResId(int[] mChoiceResId) {
        this.mChoiceResId = mChoiceResId;
    }

    public int getmTextResId() {
        return mTextResId;
    }

    public void setmTextResId(int mTextResId) {
        this.mTextResId = mTextResId;
    }

    public int getmCorrectAnswerResId() {
        return mCorrectAnswerResId;
    }

    public void setmCorrectAnswerResId(int mCorrectAnswerResId) {
        this.mCorrectAnswerResId = mCorrectAnswerResId;
    }

//    //Getter for mAnswerTrue
//    public boolean isAnswerTrue() {
//        return mAnswerTrue;
//    }
//
//    //Setter for mAnswerTrue
//    public void setAnswerTrue(boolean answerTrue) {
//        mAnswerTrue = answerTrue;
//    }

    //Getter for mTextResId
    public int getTextResId() {
        return mTextResId;
    }

    //Setter for mTextResId
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
