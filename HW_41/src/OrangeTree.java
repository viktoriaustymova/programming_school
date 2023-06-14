import java.util.ArrayList;
import java.util.List;


public class OrangeTree {
    private double height;
    private int age;
    private boolean isDead;
    private boolean isMature;
    private List<Orange> oranges = new ArrayList<>();


    public OrangeTree(double height, int age) {
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }



    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "OrangeTree" +
                " height=" + height +
                ", age =" + age;
    }



    public boolean isDead() {
        if (age>100){
            isDead=true;
        }
        return isDead;
    }

    public boolean isMature() {
        if (age>=6){
            isMature=true;
        }
        return isMature;
    }

    public void removeOranges(){
        oranges.clear();
    }

    public void passGrowingSeason() {
        age++;
        if (height < 25) {
            height+= 2.5;
        }
        if (isMature) {
            int numberOfOranges = (int)(100+Math.random() * (300 - 100 +1));
            for (int i = 0; i<numberOfOranges;i++){
                oranges.add(new Orange());
            }
        }
    }

    public  boolean hasOranges (){
        if(oranges.isEmpty()){
            return false;
        }
        return true;
    }

    public Orange pickOrange() {
        // если есть апельсины
        if (hasOranges()) {
            // вариант 1
            // взяли апельсин
            Orange orange = oranges.get(oranges.size() - 1);
            // удалили с дерева
            oranges.remove(oranges.size() - 1);
            // вернули взятый апельсин
            return orange;
        }
        return null;
        // вариант 2 в одну строку
        // return oranges.pop(); // если заменить все LinkedList - то можно можно будет пользоваться методом pop
    }

    public double getAverageSizeOfOrange() {
        if (!hasOranges()){
            return 0;
        }
        double sum = 0;
        for (Orange orange : oranges) {
            sum += orange.getDiameter();
        }
        return sum / oranges.size();
    }





}
