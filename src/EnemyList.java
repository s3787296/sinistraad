public class EnemyList {

    // Creating new instance of enemy Feral Duskwolf
    public static Enemy feralDuskwolf() {
        Enemy feralDuskwolf = new Enemy("Feral Duskwolf", "ENEMY", 10);
        return feralDuskwolf;
    }

    // Creating new instance of boss Alpha Duskwolf
    public static Enemy alphaDuskwolf() {
        Enemy alphaDuskwolf = new Enemy("Alpha Duskwolf", "BOSS", Game.player.getXp(), Story.beforeWerewolvesStory(), Story.afterWerewolvesStory(), ItemList.wolfhideArmour());
        return alphaDuskwolf;
    }
    
    // Creating new instance of enemy Archnid Spawn
    public static Enemy arachnidSpawn() {
        Enemy arachnidSpawn = new Enemy("Arachnid Spawn", "ENEMY", 10);
        return arachnidSpawn;
    }

    // Creating new instance of boss Arachnid Matriarch
    public static Enemy arachnidMatriarch() {
        Enemy arachnidMatriarch = new Enemy("Arachnid Matriarch", "BOSS", Game.player.getXp(), Story.beforeArachnidStory(), Story.afterArachnidStory(), ItemList.matriarchsBlood());
        return arachnidMatriarch;
    }

    // Creating new instance of enemy lost spirit
    public static Enemy lostSpirit() {
        Enemy lostSpirit = new Enemy("Lost Spirit", "ENEMY", 10);
        return lostSpirit;
    }

    // Creating new instance of boss Lost Maiden
    public static Enemy lostMaiden() {
        Enemy lostMaiden = new Enemy("Arachnid Spawn", "BOSS", Game.player.getXp(), Story.beforeMaidenStory(), Story.afterMaidenStory(), ItemList.maidensBlessing());
        return lostMaiden;
    }

    // Creating new instance of enemy Animated Guard
    public static Enemy animatedGuard() {
        Enemy animatedGuard = new Enemy("Animated Guard", "ENEMY", 10);
        return animatedGuard;
    }

    // Creating new instance of boss Gatekeeper Syek
    public static Enemy gatekeeperSyek() {
        Enemy gatekeeperSyek = new Enemy("Gatekeeper Syek", "BOSS", Game.player.getXp(), Story.beforeGatekeeperSyek(), Story.afterGatekeeperSyek(), ItemList.gateKey());
        return gatekeeperSyek;
    }

    // Creating new instance of enemy Stoneskin Gargoyle
    public static Enemy stoneskinGargoyle() {
        Enemy stoneskinGargoyle = new Enemy("Stoneskin Gargoyle", "ENEMY", 10);
        return stoneskinGargoyle;
    }

    // Creating new instance of boss Forgemaster Fuego
    public static Enemy forgemasterFuego() {
        Enemy forgemasterFuego = new Enemy("Forgemaster Fuego", "BOSS", Game.player.getXp(), Story.beforeFuegoStory(), Story.afterFuegoStory(), ItemList.forgemastersGreatsword());
        return forgemasterFuego;
    }

    // Creating new instance of boss Count Eripmav
    public static Enemy countEripmav() {
        Enemy countEripmav = new Enemy("Count Eripmav", "BOSS", Game.player.getXp(), Story.beforeEripmavStory(),null, null);
        return countEripmav;
    }
}
