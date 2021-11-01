package ru.productstar;

import ru.productstar.dto.Question;

public class AnswerChecker {
    public boolean isUserAnswerCorrect(String userAnswer, Question question) {
        return question.equals(
                new Question(question.getQuestionType(), question.getText(), userAnswer, question.getAnswerOptions())
        );
    }
}
