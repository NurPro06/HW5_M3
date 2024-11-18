package kg.geeks.game.players

class Berserk(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.BLOCK_DAMAGE_REVERT) {
    var blockedDamage: Int = 0

    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        boss.health -= blockedDamage
        println("$name вернул $blockedDamage урона боссу")
    }
}