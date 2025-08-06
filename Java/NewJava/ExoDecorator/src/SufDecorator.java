public class SufDecorator extends TextDecorator{


    public SufDecorator(Text text) {
        super(text);
    }

    public String transform(){
        return super.transform() + "_";
    }
}
