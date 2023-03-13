public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();

        cocheCrud.save(new CocheCRUDImpl());
        cocheCrud.delete(new CocheCRUDImpl());
        cocheCrud.findAll();
    }
}
