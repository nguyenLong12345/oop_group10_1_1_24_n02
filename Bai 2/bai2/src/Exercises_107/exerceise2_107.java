package Exercises_107;


public class exerceise2_107 {
    private String atdf = "Khoi tao boi def";
    private String byStructor ;

    public exerceise2_107(String gia_tri){
        this.byStructor = gia_tri;
    }
    public void hien_gia_tri(){
        System.out.println("Gia tri khoi tao tu atdef"+ atdf);
        System.out.println("Gia tri khoi tao tu bycostructor: "+ byStructor);
    }
    public static void main(String[] args) {
        exerceise2_107 thu = new exerceise2_107("Gia tri khoi tao tu constructor");
        thu.hien_gia_tri();
    }
}


