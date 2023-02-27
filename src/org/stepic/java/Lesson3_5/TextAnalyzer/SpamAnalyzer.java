package org.stepic.java.Lesson3_5.TextAnalyzer;

class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;
    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }
    @Override
    protected Label getLabel() {
        return Label.SPAM;
    }
}
