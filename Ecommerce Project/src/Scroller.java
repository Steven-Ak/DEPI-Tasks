public interface Scroller {
    void display();
}
//we use decorator here to add a new feature
//Steven Akram
class ProductList implements Scroller{

    @Override
    public void display() {
        System.out.println("Displaying Product List...");
    }
}

abstract class ScrollDecorator implements Scroller{
    protected Scroller scroller;

    public ScrollDecorator(Scroller scroller){
        this.scroller = scroller;
    }
    @Override
    public void display() {
        scroller.display();
    }
}

class ScrollerDecorator extends ScrollDecorator{

    public ScrollerDecorator(Scroller scroller) {
        super(scroller);
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Adding Scroll Bar...");
    }
}