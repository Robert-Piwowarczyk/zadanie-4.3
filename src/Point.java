public class Point {
    private int a;
    private int b;

    Point(int x, int y) {
        a = x;
        b = y;
    }

    public boolean setCheckI() {
        if (a < 0 && b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckII() {
        if (a > 0 && b > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckIII() {
        if (a > 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setCheckIV() {
        if (a < 0 && b < 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setLookForPointOnX() {
        if (a < 0 || a > 0 && b==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setLookForPointOnY() {
        if (b < 0 || b > 0 && a==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean setLookForPointOnCenter() {
        if (a == 0 && b == 0) {
            return true;
        } else {
            return false;
        }
    }
}






