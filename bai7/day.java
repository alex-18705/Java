package bai7;

public class day {
    private int day;
    private int month;
    private int year;

    // tao ham constructor, khong co kieu tra ve
    public day(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // viet ra cac phuong thuc
    public void printfDay(){
        System.out.println("Day "+day);
    }
    public void printfMonth(){
        System.out.println("Month "+month);
    }
    public void printfYear(){
        System.out.println("Year "+year);
    }
    public void printfDate(){
        System.out.println("day "+day+" month "+month+" year "+year);
    }


    // gioi thieu phuong thuc equals
    @Override
    public boolean equals(Object obj){
        // this o day chinh la doi tuong dang tham chieu
        if(this == obj){
            return true;
        }
        // phuong thuc getClass la dung de tra ve class cua bien do
        if(obj==null || getClass() != obj.getClass()){
            return false;
        }
        // ep kieu tuong minh de so sanh truong du lieu
        day d = (day)obj;
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }


    // gioi thieu ve phuong thuc hascode
    @Override
    public int hashCode(){
        return java.util.Objects.hash(day, month, year);
    }

    
    // gioi thieu ham toString
    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year;
    }

}
