public abstract class Animal{
    String name;

    // konstruktor
    public Animal(String name){
        this.name = name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    //метод для звуков
    public void makeNoise(){
    }
    // метод для еды
    public void eat(){
    }
    // метод выводит описание
    public void getDescription(){
    }

}
