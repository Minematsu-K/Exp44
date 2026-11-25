
final class FinalBoss extends Monster{
	private int attack;
	
	FinalBoss(String name,int attack){
		super(name);
		this.attack=attack;
	}
	
	@Override
	public int calculateDamage(){
		return this.attack*3;
	}
}
