package dev.nj.webquiz.web;

import dev.nj.webquiz.entities.Quiz;
import dev.nj.webquiz.entities.Result;
import dev.nj.webquiz.entities.User;
import dev.nj.webquiz.services.QuizService;
import dev.nj.webquiz.web.dto.AnswerDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Quiz>> getQuizzes(@AuthenticationPrincipal User user) {
        return ResponseEntity.ok(quizService.getQuizzes(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuiz(@PathVariable("id") Long quiz,
                                        @AuthenticationPrincipal User user) {
        return ResponseEntity.ok(quizService.getQuiz(quiz, user));
    }

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody @Valid Quiz quiz,
                                           @AuthenticationPrincipal User user) {
        return ResponseEntity.ok(quizService.createQuiz(quiz, user));
    }

    @PostMapping("/{id}/solve")
    public ResponseEntity<Result> answerQuiz(@PathVariable("id") Long quiz,
                                             @RequestBody AnswerDto answer,
                                             @AuthenticationPrincipal User user) {
        return ResponseEntity.ok(quizService.answerQuiz(quiz, answer, user));
    }
}
