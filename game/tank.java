package game;

class tank extends charaters {
    public tank(String name) {
        super(name, 120, 10);
    }

    
    @Override
    public void attack(charaters opponent) {
        int damage = this.attackDamage;
        opponent.takeDamage(damage);
        System.out.println(this.name + " slashes his axe at "
        		+ "" + opponent.getName() + ", dealing " + damage + " damage");
    }

    
    @Override
    public void specialMove(charaters opponent) {
        int damage = 25;
        opponent.takeDamage(damage);
        System.out.println(this.name + " uses hammer Bash on " 
        + opponent.getName() + ", dealing " + damage + " damage");
        
    }
}
