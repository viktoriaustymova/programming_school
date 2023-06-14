public enum Months {
    JANUARY("Январь",1),
    FEBRUARY("Февраль",2),
    MARCH("Март",3),
    APRIL("Апрель",4),
    MAY("Май",5),
    JUNE("Июнь",6),
    JULY("Июль",7),
    AUGUST("Август",8),
    SEPTEMBER("Сентябрь",9),
    OCTOBER("Октябрь",10),
    NOVEMBER("Ноябрь",11),
    DECEMBER("Декабрь",12);

    String ruName;
    int numberOfMonth;
    Months(String ruName,int numberOfMonth){
        this.ruName = ruName;
        this.numberOfMonth = numberOfMonth;
    }

    public String toString(){
        return "Месяц " + numberOfMonth + " - " + ruName;
    }




}




