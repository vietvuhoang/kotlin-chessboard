package vvu.study.kotlin.demo.games.chess.units

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class PositionTest {

    @Test
    fun `position to String THEN verify value`() {
        val position = Position(Rank.B, File.F2)
        position.toString() shouldBe "B2"
    }

    @Test
    fun `create Position from a String THEN verify`() {
        val positionS = "B2"
        val position = Position(Rank.B, File.F2)

        positionS.toPosition() shouldBe position
    }

    @Test
    fun `create Position from a Invalid String THEN throw exception`() {
        val positionS = "T2"
        shouldThrow<IllegalPositionError> { positionS.toPosition() }
    }

}