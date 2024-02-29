public class Main {
    public static void main(String[] args) {
        ToyStore toyStore = new ToyStore();

        toyStore.addToy(1, "Конструктор", 5, 20);
        toyStore.addToy(2, "Робот", 5, 20);
        toyStore.addToy(3, "Кукла", 5, 60);


        toyStore.drawToys(10);
    }
}
