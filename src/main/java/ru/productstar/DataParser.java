package ru.productstar;

import ru.productstar.dto.Question;
import ru.productstar.dto.QuestionType;

import java.util.*;

public class DataParser {
    public List<Question> parseQuestions(List<String> data) {
        List<Question> result = new ArrayList<>();

        int i = 0;

        while(i < data.size()) {
            String type = data.get(i);

            QuestionType questionType;
            String questionText;
            List<String> answerOptions = new ArrayList<>();
            String questionAnswer;

            switch (type) {
                case "type:questionWithAnswers":
                    questionType = QuestionType.QUESTION_WITH_ANSWERS;
                    questionText = data.get(i+1);
                    answerOptions = new ArrayList<>(Arrays.asList(data.get(i+2).split(";")));
                    questionAnswer = data.get(i+3);
                    i += 4;
                    break;
                case "type:openQuestion":
                    questionType = QuestionType.OPEN_QUESTION;
                    questionText = data.get(i+1);
                    questionAnswer = data.get(i+2);
                    i += 3;
                    break;
                default:
                    // todo: log unknown question type
                    continue;
            }

            result.add(new Question(questionType, questionText, questionAnswer, answerOptions));
        }

        return result;
    }
}
