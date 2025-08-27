package game;

class mage extends charaters {
    public mage(String name) {
        super(name, 100, 15);
    }
    
    @Override
    public void attack(charaters opponent) {
        int damage = this.attackDamage;
        opponent.takeDamage(damage);
        System.out.println(this.name + " casts a hellfire at " +
        opponent.getName() + ", dealing " + damage + " damage");
        
    }

    @Override
    public void specialMove(charaters opponent) {
        int damage = 30; 
        opponent.takeDamage(damage);
        System.out.println(this.name + ""
        		+ " summons a dust on " + opponent.getName() + ""
        				+ ", dealing " + damage + " damage");
    }
}