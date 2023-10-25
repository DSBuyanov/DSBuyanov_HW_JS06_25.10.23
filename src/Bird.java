
//LSP
// Рефакторинг: Применение принципа Liskov Substitution Principle (LSP)
// Мы создаем интерфейс FlyableBird, который будет иметь метод fly().
// Таким образом, птицы, которые не могут летать, не будут реализовывать этот интерфейс.
interface FlyableBird {
    void fly();
}

class Bird {
    // Общая логика для всех птиц
}

class Ostrich extends Bird {
    // Страус не реализует интерфейс FlyableBird, так как не умеет летать
}

class Sparrow extends Bird implements FlyableBird {
    public void fly() {
        // Реализация полета воробья
    }
}
