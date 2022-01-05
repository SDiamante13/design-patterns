package edu.pattern.abstractfactory;

public interface AbstractCommunicationFactory {
    Greetings createGreetings();
    Questions createQuestions();
}
