import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Mazlicek> Mazlicek=new ArrayList<>();

        while (true){
            System.out.println("1 -- přidat mazlíčka");
            System.out.println("2 -- možnosti výpisu");
            System.out.println("3 -- konec");
            int mzn=sc.nextInt();sc.nextLine();

            if (mzn==3){
                break;
            }
            if (mzn==1) {
             System.out.println("Jak se jmenuje mazlíček");
             String jmeno = sc.nextLine();
             System.out.println("Jaký je to druh");
             String druh = sc.nextLine();
             System.out.println("kolik mu je");
             int vek= sc.nextInt();sc.nextLine();
             System.out.println("kolik váží mazlíček");
             int vaha = sc.nextInt();sc.nextLine();

                Mazlicek mazlicek=new Mazlicek(jmeno,druh,vek,vaha);
                Mazlicek.add(mazlicek);
            }
            if (mzn==2){
                System.out.println("Jakou možnost");
                System.out.println("1-- jenom jména");
                System.out.println("2--prumer veku");
                System.out.println("3--prumer vaha");
                System.out.println("4--najit mazlu");
                System.out.println("5-- filtr podle druhu");
                System.out.println("6--konec");
                int info = sc.nextInt();sc.nextLine();

                if(info==6){
                    break;
                }
                if (info==1){
                    System.out.println("Jméno ");
                    for (Mazlicek m : Mazlicek){
                        int pocet= Mazlicek.indexOf(m);
                        System.out.println(m.getJmeno());
                        if (pocet+1 <Mazlicek.size()){
                            System.out.println(", ");
                        }else{
                            System.out.println(".");
                        }


                    }System.out.println("\n\n");
                }
                if(info==2){

                }
                if(info==3){

                }
                if(info==4){
                   System.out.println("Najít mazlu podle jména");
                   String najit=sc.nextLine();
                   for(Mazlicek m: Mazlicek){
                       if (m.getJmeno().equals(najit)){
                           System.out.println(m.toString());
                       }
                   }
                }
                if(info==5){

                }
            }
            }

            }


    }
