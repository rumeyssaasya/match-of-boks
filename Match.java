public class Match {
    fighter f1;
    fighter f2;
    int minWeight;
    int maxWeight;
    Match(fighter f1, fighter f2,int minWeight,int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }
    public void run(){
        if (isCheck()){
            while (this.f1.health>0&&this.f2.health>0){
                System.out.println("\n======>NEW ROUND<========");
                this.f2.health=this.f1.hit(f2);

                if (isWin())
                    break;

                this.f1.health=this.f2.hit(f1);

                if (isWin())
                    break;
                System.out.println(this.f2.name+" Kalan can: "+this.f2.health);
                System.out.println(this.f1.name+" Kalan can: "+this.f1.health);
            }
        }
        else
            System.out.println("Sporcuların sikletleri uymuyor.");

    }
    boolean isCheck(){
        return (this.f1.weight>=minWeight&&this.f1.weight<=maxWeight)&&(this.f2.weight>=minWeight&&this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" kazandı.");
            return true;}
        else if (this.f2.health==0) {
            System.out.println(this.f1.name+" kazandı");
            return true;
        }
        return false;
    }

    public void posibility(){
        int naim=0;
        int tobias=0;

        double number= Math.random();
        if (number>0.5)
            naim++;
        else
            tobias++;
        int plus = naim+tobias;

        System.out.println("Naim'in başlama olasılığı: "+((double) naim/plus));
        System.out.println("Tobias'ın başlama olasılığı: "+((double) tobias/plus));

    }
}

