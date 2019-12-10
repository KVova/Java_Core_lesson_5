package volodymyr.task4;

public class Application 
{
    // клас, що реалізує коло на координатній площині
    private int x, y; // координати центру кола
    private int r; // радіус кола

    // перевантажені конструктори
    Application()
    {
        x = y = 0;
        r = 1;
    }

    // конструктор з 1 параметром
    Application(int r)
    {
        this.r = r;
    }

    // конструктор з 2 параметрами
    Application(int x, int y)
    {
        this.x = x;
        this.y = y;
        r = 1;
    }

    // конструктор з 3 параметрами
    Application(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // методи доступу
    // повертає коло
    Application GetCircle()
    {
        // створити новий об'єкт типу Circle, обов'язково виділити пам'ять для нього
        Application c = new Application(x, y, r);
        return c;    // повернути об'єкт
    }

    // повернути координати і радіус
    int GetX() { return x; }
    int GetY() { return y; }
    int GetR() { return r; }

    // встановити нові значення x, y, r
    void SetXYR(int nx, int ny, int nr)
    {
        x = nx;
        y = ny;
        r = nr;
    }

    // метод, що обчислює площу круга
    double GetSquare()
    {
        return (double)(3.1415*r*r);
    }
}