package org.stepic.java.Lesson3_5.TextAnalyzer;
abstract class KeywordAnalyzer implements TextAnalyzer {
    abstract protected String[] getKeywords();
    abstract protected Label getLabel();
    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
