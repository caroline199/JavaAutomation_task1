package LessonThree;

public class Numbers {
    private int x;
    private int y;

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getSum() {
        return this.getX() + this.getY();
    }

    public int getDiff() {
        return this.getX() - this.getY();
    }

    public int getDivOnY() {
        return this.getX() / this.getY();
    }

    public int getMult() {
        return this.getX() * this.getY();
    }

    public double getResult(char operation) {
        double result;
        switch (operation) {
            case '+':
                result = this.getSum();
                break;
            case '-':
                result = this.getDiff();
                break;
            case '/':
                result = this.getDivOnY();
                break;
            case '*':
                result = this.getMult();
                break;
            default:
                result = 0;
            }
            return result;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}