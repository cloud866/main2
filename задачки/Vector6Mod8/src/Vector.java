public abstract class Vector {
    static int x1;
    static int y1;
    static int z1;
    static int x2;
    static int y2;
    static int z2;

    public Vector(int x1, int y1, int z1, int x2, int y2, int z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public abstract double getLength();
    public abstract String getVectorCords();
}
