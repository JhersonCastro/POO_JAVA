package Users;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Father extends User {
    List<Student> sons = new ArrayList<>();
    public Father(String name, String bornDate, String ID, List<Student> sons) {
        super(name, bornDate, ID);
        this.sons = sons;
    }
    private void ViewNote(){
        
    }
    private Student SearchSon(){
        if(sons.size()>1){
            sons.forEach((n) -> System.out.println("Hijo: " + n+  "\n"));
            Scanner scan = new Scanner(System.in);
            System.out.println("Select your son (1-" + sons.size()+ ")");
            return sons.get(scan.nextInt());
        }else
            return sons.get(0);
    }
}
