package Code1Week2;

public class NNCollection {
    private NameNumber[] nnArray = new NameNumber[100];
    private int free;

    public NNCollection() {
        free = 0;
    }

    public void insert(NameNumber n) {
        int index = 0;
        for (int i = free++; i != 0 &&
                nnArray[i - 1].getLastName().compareTo(n.getLastName()) > 0; i--) {
            nnArray[i] = nnArray[i - 1];
            index = i;
        }
        nnArray[index] = n;
    }

    public String findNumber(String lName) {
        for (int i = 0; i != free; i++)
            if (nnArray[i].getLastName().equals(lName))
                return nnArray[i].getTelNumber();
        return new String("Name not found");
    }

    public NameNumber[] getNnArray() {
        return nnArray;
    }

    public void setNnArray(NameNumber[] nnArray) {
        this.nnArray = nnArray;
    }

    public int getFree() {
        return free;
    }

    public void setFree(int free) {
        this.free = free;
    }

}