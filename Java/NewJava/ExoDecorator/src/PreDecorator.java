public class PreDecorator extends TextDecorator{


    public PreDecorator(Text text) {
        super(text);
    }

    public String transform(){
        return "_" + super.transform();
    }
}
