public class GameEntity {
    private String bossName;
    private int healtheBoss;
    private int damageBoss;
    private String defenceTypeBoss;

    private String nameHero;
    private int healtheHero;
    private int damageHero;
    private String superAbilityHero;


    public int getHealtheBoss() {
        return healtheBoss;
    }

    public void setHealtheBoss(int healtheBoss) {
        this.healtheBoss = healtheBoss;
    }

    public int getDamageBoss() {
        return damageBoss;
    }

    public void setDamageBoss(int damageBoss) {
        this.damageBoss = damageBoss;
    }

    public String getDefenceTypeBoss() {
        return defenceTypeBoss;
    }

    public void setDefenceTypeBoss(String defenceTypeBoss) {
        this.defenceTypeBoss = defenceTypeBoss;
    }

    public int getHealtheHero() {
        return healtheHero;
    }

    public void setHealtheHero(int healtheHero) {
        this.healtheHero = healtheHero;
    }

    public int getDamageHero() {
        return damageHero;
    }

    public void setDamageHero(int damageHero) {
        this.damageHero = damageHero;
    }

    public String getSuperAbilityHero() {
        return superAbilityHero;
    }

    public void setSuperAbilityHero(String superAbilityHero) {
        this.superAbilityHero = superAbilityHero;
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public  String toString() {
        return "Hero{" + bossName + " has:  " +
                "healthe=" + healtheBoss +
                ", damage=" + damageBoss +
                ", defenceTypeBoss='" + defenceTypeBoss + '\'' +
                '}';
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public String getBossName() {
        return bossName;
    }
}


