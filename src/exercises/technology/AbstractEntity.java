package exercises.technology;

public abstract  class AbstractEntity {
    private static int nextId = 0;
    int id = -1;

    public AbstractEntity() {
        this.id = getNextId();
    }

    public static int getNextId() {
        nextId++;
        return nextId;
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
