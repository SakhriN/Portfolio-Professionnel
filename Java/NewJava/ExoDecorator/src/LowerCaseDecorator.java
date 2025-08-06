public class LowerCaseDecorator extends TextDecorator{


    public LowerCaseDecorator(Text text) {
        super(text);
    }

    public String transform(){
        return super.transform().toLowerCase();
    }
}
