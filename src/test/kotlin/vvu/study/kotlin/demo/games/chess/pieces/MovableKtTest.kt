package vvu.study.kotlin.demo.games.chess.pieces

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import vvu.study.kotlin.demo.games.chess.units.File
import vvu.study.kotlin.demo.games.chess.units.Rank
import vvu.study.kotlin.demo.games.chess.units.toPosition

internal class MovableKtTest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `Rank B plus 2 to SHOULD BE D`() {
        (Rank.B + 2) shouldBe Rank.D
    }

    @Test
    fun `Rank E plus -3 to SHOULD BE B`() {
        (Rank.E + -3) shouldBe Rank.B
    }

    @Test
    fun `Rank E plus 4 to SHOULD throw IllegalMovingStepError`() {
        shouldThrow<IllegalMovingStepError> { (Rank.E + 4) }
    }

    @Test
    fun `File 3 plus 2 to SHOULD BE 5`() {
        (File.F3 + 2) shouldBe File.F5
    }

    @Test
    fun `File 5 plus -2 to SHOULD BE 3`() {
        (File.F5 + -2) shouldBe File.F3
    }

    @Test
    fun `File 5 plus 4 to SHOULD throw IllegalMovingStepError`() {
        shouldThrow<IllegalMovingStepError> { (File.F5 + 4) }
    }

    @Test
    fun `Position B1 moves 1 horizontal steps and 2 vertical steps SHOULD BE C3`() {
        "B1".toPosition().move(horizontalSteps = 1, verticalSteps = 2) shouldBe "C3".toPosition()
    }
}