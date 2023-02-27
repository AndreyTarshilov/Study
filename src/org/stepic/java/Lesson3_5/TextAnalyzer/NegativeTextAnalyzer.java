package org.stepic.java.Lesson3_5.TextAnalyzer;

class NegativeTextAnalyzer extends KeywordAnalyzer {
    @Override
    protected String[] getKeywords() {
        return new String[] {":(","=(",":|"};
    }
    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
