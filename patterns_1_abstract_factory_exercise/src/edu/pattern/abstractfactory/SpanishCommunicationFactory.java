package edu.pattern.abstractfactory;

public class SpanishCommunicationFactory implements AbstractCommunicationFactory {
    @Override
    public Greetings createGreetings() {
        return new GreetingsEs();
    }

    @Override
    public Questions createQuestions() {
        return new QuestionsEs();
    }
}
