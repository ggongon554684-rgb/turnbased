package game;

public abstract class charaters {

	 String name;
	    int hp;
	    int attackDamage;

	    public charaters (String name, int hp, int attackDamage) {
	        this.name = name;
	        this.hp = hp;
	        this.attackDamage = attackDamage;
	    }

	    public abstract void attack(charaters opponent);
	    public abstract void specialMove(charaters opponent);

	    public void showName() {
	        System.out.println("Character: " + name);
	    }
	    
	    		public int getHp() {
	        return this.hp;
	    }

	    		public void setHp(int hp) {
	        this.hp = hp;
	    }
	    
	    			public String getName() {
	        return this.name;
	    }

	    				public void takeDamage(int damage) {
	        this.hp -= damage;
	    }
	    
	    				public int getAttackDamage() {
	        return this.attackDamage;
	    }
}
