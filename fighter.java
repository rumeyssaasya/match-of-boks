public class fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    fighter(String name,int damage,int health,int weight,int dodge){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodge=dodge;
        if (this.dodge>=0&&this.dodge<=100)
            this.dodge=dodge;
        else
            this.dodge=0;
    }
    public int hit(fighter foe){
        System.out.println(this.name+" ====> "+foe.name+" "+this.damage+" hasar vurdu.");
        if (foe.isDodge()){
            System.out.println(foe.name+" hasarı blokladı.");
            return foe.health;}
        if (foe.health-this.damage<0){
            return 0;
            }
        return foe.health-this.damage;
    }
    boolean isDodge(){
        double randomValue= Math.random()*100;
        return randomValue<=this.dodge;
    }
    }

