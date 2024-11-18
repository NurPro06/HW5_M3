package kg.geeks.game.players

class Ronaldo(health: Int, damage: Int, name: String) : Hero(health, damage, name, SuperAbility.SHOOT_BALL) {
    override fun applySuperPower(boss: Boss, heroes: Array<Hero>) {
        val ballDamage = damage * 2
        boss.health -= ballDamage
        println("$name выстрелил мячом и нанес урон $ballDamage")
    }
}