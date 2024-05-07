import java.util.ArrayList;
import java.util.Scanner;
public class QLPT {
    ArrayList<Oto> DSOT = new ArrayList<>();
    ArrayList<Xemay> DSXM = new ArrayList<>();
    ArrayList<XeTai> DSXT = new ArrayList<>();

    public void ThemOTo(){
        if(DSOT.size()>0){
            Oto OtoMoi = new Oto(null, null, 0, 0, null, 0, null);
            DSOT.add(OtoMoi);
        }
    }
}
