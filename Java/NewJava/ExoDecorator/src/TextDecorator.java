public abstract class TextDecorator implements Text {
    private Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public String transform() {
    return text.transform();
    }
}
