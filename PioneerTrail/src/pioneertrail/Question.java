package pioneertrail;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hector Mendoza
 */
public class Question implements Serializable {
    
    private String questionText;
    private String answerOne;
    private String answerTwo;
    private String answerThree;
    private String answerFour;
    private int correctAnswer;
    
    private Scene scene;

    public Question() {
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(String answerOne) {
        this.answerOne = answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(String answerTwo) {
        this.answerTwo = answerTwo;
    }

    public String getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(String answerThree) {
        this.answerThree = answerThree;
    }

    public String getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(String answerFour) {
        this.answerFour = answerFour;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.questionText);
        hash = 47 * hash + Objects.hashCode(this.answerOne);
        hash = 47 * hash + Objects.hashCode(this.answerTwo);
        hash = 47 * hash + Objects.hashCode(this.answerThree);
        hash = 47 * hash + Objects.hashCode(this.answerFour);
        hash = 47 * hash + this.correctAnswer;
        return hash;
    }
    

    @Override
    public String toString() {
        return "Question{" + "questionText=" + questionText + ", answerOne=" + answerOne + ", answerTwo=" + answerTwo + ", answerThree=" + answerThree + ", answerFour=" + answerFour + ", correctAnswer=" + correctAnswer + '}';
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Question other = (Question) obj;
        if (this.correctAnswer != other.correctAnswer) {
            return false;
        }
        if (!Objects.equals(this.questionText, other.questionText)) {
            return false;
        }
        if (!Objects.equals(this.answerOne, other.answerOne)) {
            return false;
        }
        if (!Objects.equals(this.answerTwo, other.answerTwo)) {
            return false;
        }
        if (!Objects.equals(this.answerThree, other.answerThree)) {
            return false;
        }
        if (!Objects.equals(this.answerFour, other.answerFour)) {
            return false;
        }
        return true;
    }   
}