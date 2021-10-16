public class Cat {
    private String name;
    private int appetite;
    private boolean isfull;


    public Cat(String name, int appetite, boolean isfull) {
        this.name = name;
        this.appetite = appetite;
        this.isfull = false;
    }

    public void setIsfull(boolean isfull) {
        this.isfull = isfull;// установка статуса сытости
    }

    public boolean getIsfull() {
        return isfull;//чтение статуса сытости
    }

    public void eat() {}

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite; // сколько кушает
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void eat(Plate pplate1) {
        pplate1.decreaseFood(appetite);
    }

}
