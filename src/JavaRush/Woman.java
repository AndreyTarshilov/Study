package JavaRush;

public class Woman {
    private String noseSize;
    private String eyesColor;
    private String haircut;
    private boolean scars;
    private int dnaCode;

    public Woman (String noseSize, String eyesColor, String haircut, boolean scars, int dnaCode) {
        this.noseSize = noseSize;
        this.eyesColor = eyesColor;
        this.haircut = haircut;
        this.scars = scars;
        this.dnaCode = dnaCode;
    }

    /*public boolean equals (Object obj) {
        return (this == obj);}   */
    /*@Override
    public boolean equals(Object obj) {
        Woman woman = (Woman) obj;
        return dnaCode == woman.dnaCode;
    }*/
}
