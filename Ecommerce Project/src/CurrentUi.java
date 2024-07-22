public interface CurrentUi {
    void display();
}
// we use here adapter to integrate new library
//Steven Akram

class LibraryComponent{
    public void add(){
        System.out.println("Adding New Library Components...\n");
    }
}

class LibraryAdapter implements CurrentUi{
    private LibraryComponent libraryComponent;

    public LibraryAdapter(LibraryComponent LibraryComponent){
        this.libraryComponent = new LibraryComponent();
    }

    @Override
    public void display() {
        libraryComponent.add();
    }
}