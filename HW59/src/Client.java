public class Client {
    private String name;
    private boolean hasHaircut;

    private boolean hasManicure;

    public Client(String name) {
        this.name = name;
        this.hasHaircut = false;
        this.hasManicure = false;
    }

    public void setHasManicure(boolean hasManicure) {
        this.hasManicure = hasManicure;
    }

    public void setHasHaircut(boolean hasHaircut) {
        this.hasHaircut = hasHaircut;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", hasHaircut=" + hasHaircut +
                '}';
    }
}
