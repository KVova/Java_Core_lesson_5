package volodymyr.task4;

public class Application 
{
    // ����, �� ������ ���� �� ����������� ������
    private int x, y; // ���������� ������ ����
    private int r; // ����� ����

    // ������������ ������������
    Application()
    {
        x = y = 0;
        r = 1;
    }

    // ����������� � 1 ����������
    Application(int r)
    {
        this.r = r;
    }

    // ����������� � 2 �����������
    Application(int x, int y)
    {
        this.x = x;
        this.y = y;
        r = 1;
    }

    // ����������� � 3 �����������
    Application(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // ������ �������
    // ������� ����
    Application GetCircle()
    {
        // �������� ����� ��'��� ���� Circle, ����'������ ������� ���'��� ��� �����
        Application c = new Application(x, y, r);
        return c;    // ��������� ��'���
    }

    // ��������� ���������� � �����
    int GetX() { return x; }
    int GetY() { return y; }
    int GetR() { return r; }

    // ���������� ��� �������� x, y, r
    void SetXYR(int nx, int ny, int nr)
    {
        x = nx;
        y = ny;
        r = nr;
    }

    // �����, �� �������� ����� �����
    double GetSquare()
    {
        return (double)(3.1415*r*r);
    }
}