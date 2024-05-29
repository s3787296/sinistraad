public class EnemyList {

    // creating new instance of enemy Feral Duskwolf
    public static Enemy feralDuskwolf() {
        Enemy feralDuskwolf = new Enemy("Feral Duskwolf", "ENEMY", 10);
        return feralDuskwolf;
    }

    // creating new instance of boss Alpha Duskwolf
    public static Enemy alphaDuskwolf() {
        Enemy alphaDuskwolf = new Enemy("Alpha Duskwolf", "BOSS", Game.player.getXp());
        return alphaDuskwolf;
    }
    
    // creating new instance of enemy Archnid Spawn
    public static Enemy arachnidSpawn() {
        Enemy arachnidSpawn = new Enemy("Arachnid Spawn", "ENEMY", 10);
        return arachnidSpawn;
    }

    // creating new instance of boss Arachnid Matriarch
    public static Enemy arachnidMatriarch() {
        Enemy arachnidMatriarch = new Enemy("Arachnid Matriarch", "BOSS", Game.player.getXp());
        return arachnidMatriarch;
    }

    // creating new instance of enemy lost spirit
    public static Enemy lostSpirit() {
        Enemy lostSpirit = new Enemy("Lost Spirit", "ENEMY", 10);
        return lostSpirit;
    }

    // creating new instance of boss Lost Maiden
    public static Enemy lostMaiden() {
        Enemy lostMaiden = new Enemy("Arachnid Spawn", "BOSS", Game.player.getXp());
        return lostMaiden;
    }

    // creating new instance of enemy Animated Guard
    public static Enemy animatedGuard() {
        Enemy animatedGuard = new Enemy("Animated Guard", "ENEMY", 10);
        return animatedGuard;
    }

    // creating new instance of boss Gatekeeper Syek
    public static Enemy gatekeeperSyek() {
        Enemy gatekeeperSyek = new Enemy("Gatekeeper Syek", "BOSS", Game.player.getXp());
        return gatekeeperSyek;
    }

    // creating new instance of enemy Stoneskin Gargoyle
    public static Enemy stoneskinGargoyle() {
        Enemy stoneskinGargoyle = new Enemy("Stoneskin Gargoyle", "ENEMY", 10);
        return stoneskinGargoyle;
    }

    // creating new instance of boss Forgemaster Fuego
    public static Enemy forgemasterFuego() {
        Enemy forgemasterFuego = new Enemy("Forgemaster Fuego", "BOSS", Game.player.getXp());
        return forgemasterFuego;
    }

    // creating new instance of boss Count Eripmav
    public static Enemy countEripmav() {
        Enemy countEripmav = new Enemy("Count Eripmav", "BOSS", Game.player.getXp());
        return countEripmav;
    }
}
