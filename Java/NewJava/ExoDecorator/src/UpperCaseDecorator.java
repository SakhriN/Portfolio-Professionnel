public class UpperCaseDecorator extends TextDecorator{


    public UpperCaseDecorator(Text text) {
        super(text);
    }

    public String transform(){
        return super.transform().toUpperCase();
    }
}
