import Sample;

class Chaitanyagroup{
   void employee(){
    System.out.println("there are 40000 employee under chaitanya group");
   }
 }
 class Chaitanyasons{
    void Bods(){
        System.out.println("there are 10 directors");
    }
 }
 class ChaitanyaTrust{
    void Trust(){
        System.out.println("Chaitanya trust donates 100 million every year");
    }
 }
 class Multilevelinherit{
    public static void main(String[] args) {
      Sample sample = new Sample();
        ChaitanyaTrust t=new ChaitanyaTrust();
        Chaitanyasons s=new Chaitanyasons();
        Chaitanyagroup g=new Chaitanyagroup();
        g.employee();
        t.Trust();
        s.Bods();
    }
 }

