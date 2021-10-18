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
        if (food >= appetite) {// проверка доступного корма и величины аппетита
            food -= appetite;
            System.out.println(" съел " + appetite + " еды ");
        }
        else { // если в тарелке нехватило еды
            System.out.printf(" попытался съесть %s еды, но еды в тарелке нехватает\n",appetite);
            setFood(food += 50); // добавим 50 едениц еды
            System.out.printf("добавим 50 еды\n");
        }
    }
}
