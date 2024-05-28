public class EnemyList {

    // creating new instance of enemy Feral Duskwolf
    public static Enemy feralDuskwolf() {
        return new Enemy("Feral Duskwolf", "ENEMY", Game.player.getXp());
    }

    // creating new instance of boss Alpha Duskwolf
    public static Enemy alphaDuskwolf() {
        return new Enemy("Alpha Duskwolf", "BOSS", Game.player.getXp());
    }
    
    // creating new instance of enemy Archnid Spawn
    public static Enemy arachnidSpawn() {
        return new Enemy("Arachnid Spawn", "ENEMY", Game.player.getXp());
    }

    // creating new instance of boss Arachnid Matriarch
    public static Enemy arachnidMatriarch() {
        return new Enemy("Arachnid Matriarch", "BOSS", Game.player.getXp());
    }

    // creating new instance of enemy lost spirit
    public static Enemy lostSpirit() {
        return new Enemy("Lost Spirit", "ENEMY", Game.player.getXp());
    }

    // creating new instance of boss Lost Maiden
    public static Enemy lostMaiden() {
        return new Enemy("Arachnid Spawn", "BOSS", Game.player.getXp());
    }

    // creating new instance of enemy Animated Guard
    public static Enemy animatedGuard() {
        return new Enemy("Animated Guard", "ENEMY", Game.player.getXp());
    }

    // creating new instance of boss Gatekeeper Syek
    public static Enemy gatekeeperSyek() {
        return new Enemy("Gatekeeper Syek", "BOSS", Game.player.getXp());
    }

    // creating new instance of enemy Stoneskin Gargoyle
    public static Enemy stoneskinGargoyle() {
        return new Enemy("Stoneskin Gargoyle", "ENEMY", Game.player.getXp());
    }

    // creating new instance of boss Forgemaster Fuego
    public static Enemy forgemasterFuego() {
        return new Enemy("Forgemaster Fuego", "BOSS", Game.player.getXp());
    }

    // creating new instance of boss Lord Eripmav
    public static Enemy lordEripmav() {
        return new Enemy("Lord Eripmav", "BOSS", Game.player.getXp());
    }
}
