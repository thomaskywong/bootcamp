public enum Level2 {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level2(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

}