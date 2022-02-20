package vvu.study.kotlin.demo.games.chess.units

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class FileTest {
    @Test
    fun `Int toFile THEN verify`() {
        1.toFile() shouldBe File.F1
        2.toFile() shouldBe File.F2
        3.toFile() shouldBe File.F3
        4.toFile() shouldBe File.F4
        5.toFile() shouldBe File.F5
        6.toFile() shouldBe File.F6
        7.toFile() shouldBe File.F7
        8.toFile() shouldBe File.F8
        shouldThrow<IllegalFileError> { (-1).toFile() }
    }
}