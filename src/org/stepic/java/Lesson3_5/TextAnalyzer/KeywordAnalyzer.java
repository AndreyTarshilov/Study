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

class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;
    public NegativeTextAnalyzer() {
        /*for (int i = 0; i<3; i++) {
            if ((keywords[i] == ":(") || (keywords[i] == "=(") || (keywords[i] == ":|")) {
                label = Label.NEGATIVE_TEXT;
            }
        }*/
        this.keywords = new String[3];
        this.keywords[0] = ":(";
        this.keywords[1] = "=(";
        this.keywords[2] = ":|";
        label = Label.NEGATIVE_TEXT;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;
    private Label label;
    public SpamAnalyzer(String[] keywords) {
        /*for (int i =0; i<spamKeywords.length; i++) {
            if (keywords[i].contains(spamKeywords[i]))
            label = Label.SPAM;
        }*/
        this.keywords = keywords.clone(); // не понял
        label = Label.SPAM;

    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}

