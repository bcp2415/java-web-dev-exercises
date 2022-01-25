package exercises.technology;

public abstract  class AbstractEntity {
    private int nextId = 0;
    int id = -1;

    public static int getNextId() {
        return 6;
    }

    public void setOwnId() {
        if (id == -1) {
            id = getNextId();
        }
    }

    public int getOwnId() {
        if (id != -1) {
            return id;
        } else {
            this.setOwnId();
            return id;
        }
    }
}
