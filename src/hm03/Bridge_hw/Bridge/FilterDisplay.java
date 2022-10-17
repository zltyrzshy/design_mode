package hm03.Bridge_hw.Bridge;

public class FilterDisplay extends Display{

    public FilterDisplay(Displayimpl displayimpl) {
        super(displayimpl);
    }

    public  void SharpenDisplay(){
        System.out.println("Sharpen");
        this.display();
        System.out.println("Sharpen");
    }
    public void TextureDisplay(){
        System.out.println(" Texture");
        this.display();
        System.out.println(" Texture");
    }

}
