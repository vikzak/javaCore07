public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("в тарелке: " + getFood() + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    public void decreaseFood(int appetite) {
        if (food >= appetite) {
            food -= appetite;
            System.out.println(" съел " + appetite + " еды ");
        }
        else {
            System.out.printf(" попытался съесть %s еды, но еды в тарелке нехватает\n",appetite);
            setFood(food += 50);
            System.out.printf("добавили 50 еды и кормим следующего кота\n");
        }
    }
}
