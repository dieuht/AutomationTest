package Method_PhuongThuc;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PhuongThuc {
    public static String name1 = "Nam";
    public static int tuoi = 32;

    public void getinfo(){
        System.out.println("ten: " + name1 );
        System.out.println("tuoi: " + tuoi );
    }
   public static String getinfo1(){
      return name1 ;
    }

}
