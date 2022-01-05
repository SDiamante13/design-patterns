package edu.pattern.abstractfactory;

public class EnglishCommunicationFactory implements AbstractCommunicationFactory {
    @Override
    public Greetings createGreetings() {
        return new GreetingsEn();
    }

    @Override
    public Questions createQuestions() {
        return new QuestionsEn();
    }
}
