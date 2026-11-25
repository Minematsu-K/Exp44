class Exp44_1 {
	public static void main(String[] args) {
		FinalBoss boss = new FinalBoss("魔王", 100);
		boss.showName();
		System.out.println("ダメージ：" + boss.calculateDamage());
	}
}